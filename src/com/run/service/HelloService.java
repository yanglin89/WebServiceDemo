package com.run.service;

import java.util.List;

import javax.jws.WebService;

import com.run.domain.User;

@WebService  
public interface HelloService {  
    public String sayHi(String text);  
    public String getUser(User user);  
    public List<User> getListUser();  
} 