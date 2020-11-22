package com.example.pass_vault;

/**
 * Created by Ronny Ruben on 11/1/2020
 */
class Password {

    private int pass_type;
    private String title;
    private String data_userName;
    private String data_pass;

    public Password( String title, String data_userName, String data_pass) {
        this.title = title;
        this.data_userName = data_userName;
        this.data_pass = data_pass;
    }
    public Password(int pass_type, String title, String data_userName, String data_pass) {
        this.pass_type = pass_type;
        this.title = title;
        this.data_userName = data_userName;
        this.data_pass = data_pass;
    }

    public int getPass_type() {
        return pass_type;
    }

    public void setPass_type(int pass_type) {
        this.pass_type = pass_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData_userName() {
        return data_userName;
    }

    public void setData_userName(String data_userName) {
        this.data_userName = data_userName;
    }

    public String getData_pass() {
        return data_pass;
    }

    public void setData_pass(String data_pass) {
        this.data_pass = data_pass;
    }
}
