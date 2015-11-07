package com.dtc_solutions.medical_book;

/**
 * Created by dastoc on 02/11/15.
 */
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import android.util.Log;
import android.widget.Toast;

import retrofit.client.Response;

import android.content.res.TypedArray;

public class UsersFragment extends ListFragment {

    String [] member_names;
    TypedArray profile_pics;
    String[] statues;
    String[] contactType;
    List<RowItem> rowItems;
    public final String USER_URL = "/users/";


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_users, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rowItems = new ArrayList<RowItem>();

        member_names = getResources().getStringArray(R.array.Member_names);
        profile_pics = getResources().obtainTypedArray(R.array.profile_pics);
        statues = getResources().getStringArray(R.array.statues);
        contactType = getResources().getStringArray(R.array.contactType);

        for (int i = 0; i < member_names.length; i++) {
            RowItem item = new RowItem(member_names[i],
                    profile_pics.getResourceId(i, -1), statues[i],
                    contactType[i]);
            rowItems.add(item);
        }

        CustomAdapter adapter = new CustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
        profile_pics.recycle();




/*

        //====== RESTful RETROFIT ======
        //======      START       ======

        if (!ApiClient.connectInternet(this.getActivity())) {
            Toast.makeText(this.getActivity(),
                    "Verifique su acceso a internet",
                    Toast.LENGTH_SHORT).show();
            return;
        }


        ApiClient.get().getUsers(new RestCallBack<List<Users>>() {
            @Override
            public void success(List<Users> usuarios, Response response) {
                // success!
                //try {
                //Filling a ListView
                for (int i = 0; i < usuarios.size(); i++) {
                    String str_image = ApiClient.getROOT()+USER_URL+usuarios.get(i).getImageUser();
                    RowItem item = new RowItem(usuarios.get(i).getUsername(),
                            str_image, usuarios.get(i).getSenha(),
                            usuarios.get(i).getImageUser());
                    rowItems.add(item);

               }

                // } catch (IOException e) {
               //     e.printStackTrace();
               // }
            }

            @Override
            public void failure(RestError error) {
                // something went wrong
                Log.e("There are some problem", error.toJSON());
            }
        });

        //======     FINISH       ======
        //====== RESTful RETROFIT ======


        CustomAdapter adapter = new CustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
        //mylistview.setOnItemClickListener(this);*/

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        getActivity().getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}
