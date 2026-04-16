package com.handson.tinyurl.model;

public class NewTinyRequest {

    private String longUrl;

    private String userName;

    public NewTinyRequest() {}

    public NewTinyRequest(String longUrl, String userName) {
        this.longUrl = longUrl;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getLongUrl() {
        return longUrl;
    }
}
