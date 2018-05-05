package com.run.domain;

import java.io.Serializable;

public class User implements Serializable{  
    private static final long serialVersionUID = 1001881900957402607L;  
      
    private Integer id;  
    private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User() {
		super();
	}  
	
	
    
    
  
}