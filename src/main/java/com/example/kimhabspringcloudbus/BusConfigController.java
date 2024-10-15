package com.example.kimhabspringcloudbus;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope // To make see new files to send an empty POST request to ‘/refresh’ by actuator
public class BusConfigController {
    @Value("${api.version}")
    String apiVer;

    @Resource
    ConfigPropertyDatabase configPropertyDatabase;

    @GetMapping("database-config")
    public Object getConfigMsg() {
        Map<String, Object> data = new HashMap<>();
        data.put("url", configPropertyDatabase.getUrl());
        data.put("username", configPropertyDatabase.getUsername());
        return data;
    }

    @GetMapping("api-version")
    public String getDataFromConfigServer(){
        System.out.println("data: "+apiVer);
        return apiVer;
    }
}