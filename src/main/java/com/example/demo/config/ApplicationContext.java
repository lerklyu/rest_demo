package com.example.demo.config;

import com.example.demo.model.Authorities;
import com.example.demo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class ApplicationContext {

    @Bean
    public HashMap<String, User> getMap() {
        HashMap<String, User> map = new HashMap<>();
        map.put("admin", new User("123", List.of(Authorities.DELETE, Authorities.WRITE, Authorities.READ)));
        map.put("user1", new User("0000", List.of(Authorities.READ)));
        return map;
    }
}
