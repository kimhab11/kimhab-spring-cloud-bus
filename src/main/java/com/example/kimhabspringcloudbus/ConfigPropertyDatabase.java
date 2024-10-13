package com.example.kimhabspringcloudbus;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@RefreshScope
@ConfigurationProperties(prefix = "database-prd")
@Configuration
public class ConfigPropertyDatabase {
    private String url;
    private String username;
    private String password;
    private int timeOut;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getTimeOut() {
        return timeOut;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
}
