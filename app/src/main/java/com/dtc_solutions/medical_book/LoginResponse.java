package com.dtc_solutions.medical_book;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by dastoc on 28/10/15.
 */

public class LoginResponse {
    //TODO might have to make this public as private means introspection and it might be a performance hit.
    public String id;
    public String email;
    public String username;
    public String senha;
    public String dataCriacao;


    public String error;
    public Users resp;

    // default constructor, getters and setters
    public LoginResponse() {

    }

    public LoginResponse(String error, Users resp) {
        this.error = error;
        this.resp = resp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Users getUsers() {
        return resp;
    }

    public void setUsers(Users resp) {
        this.resp = resp;
    }

    public String toJSON() {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("error", error);
            jsonObject.put("Users", resp);
            return jsonObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
