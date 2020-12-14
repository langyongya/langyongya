package com.spring.cloud.sceurekaserviceprovider;

import com.spring.cloud.sceurekaserviceprovider.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class DemoService {
    @RequestMapping("/getInfo")
    public String getDemoInfo() {
        return "this is a provider service";
    }

    @RequestMapping("/getString")
    public String getDemoInfo1(String userId) {
        return userId + ",this is a provider service";
    }

    @RequestMapping("/getUser")
    public User getUser(@RequestBody User user) {
        return user;
    }
}
