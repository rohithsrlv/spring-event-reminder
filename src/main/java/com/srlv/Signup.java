package com.srlv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Signup {
	
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	

	public Signup(@Value("${signup.name}") String name,
	        @Value("${signup.email}") String email) {
		
		this.name = name;
		this.email = email;
	}

	public void greet() {

System.out.println( "Hello...." + getName());
		
	}

	

}
