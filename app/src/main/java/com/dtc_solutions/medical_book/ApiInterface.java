package com.dtc_solutions.medical_book;

import java.util.List;

import javax.security.auth.callback.Callback;

import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Body;
import retrofit.http.Path;

/**
 * Created by dastoc on 28/10/15.
 */
public interface ApiInterface {
    @GET("/GetUsers.php")
    void getUsers(RestCallBack<List<Users>> callback);
    /*List<Users> List_Users(
            @Path("email") String email,
            @Path("username") String username,
            @Path("senha") String senha,
            @Path("dataCriacao") String dataCriacao
    );*/
    /*@POST("/InsertUsers.php")
    void login(@Body Users user,
               RestCallBack<LoginResponse> callback);*/
}
