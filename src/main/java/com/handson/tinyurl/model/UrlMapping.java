package com.handson.tinyurl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "urls")
public class UrlMapping {

    @Id
    private String id;

    @Indexed(unique = true)
    private String shortCode;

    private String longUrl;
    private String userName;
    private Date createdAt;

    public UrlMapping() {}

    public UrlMapping(String shortCode, String longUrl, String userName, Date createdAt) {
        this.shortCode = shortCode;
        this.longUrl = longUrl;
        this.userName = userName;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public String getShortCode() { return shortCode; }
    public String getLongUrl() { return longUrl; }
    public String getUserName() { return userName; }
    public Date getCreatedAt() { return createdAt; }

    public void setId(String id) { this.id = id; }
    public void setShortCode(String shortCode) { this.shortCode = shortCode; }
    public void setLongUrl(String longUrl) { this.longUrl = longUrl; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
