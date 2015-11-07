package com.dtc_solutions.medical_book;

/**
 * Created by dastoc on 30/10/15.
 */
public class RowItem {

    private String member_name;
    //private String profile_pic_id;
    private int profile_pic_id;
    private String status;
    private String contactType;

   /* public RowItem(String member_name, String profile_pic_id, String status,
                   String contactType) {

        this.member_name = member_name;
        this.profile_pic_id = profile_pic_id;
        this.status = status;
        this.contactType = contactType;
    }*/

    public RowItem(String member_name, int profile_pic_id, String status,
                   String contactType) {

        this.member_name = member_name;
        this.profile_pic_id = profile_pic_id;
        this.status = status;
        this.contactType = contactType;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    /*public String getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(String profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }*/

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

}