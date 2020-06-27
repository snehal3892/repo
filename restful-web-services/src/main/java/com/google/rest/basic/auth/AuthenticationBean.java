package com.google.rest.basic.auth; 

public class AuthenticationBean {
private String msg;

public AuthenticationBean(String msg) {
	
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
	
	}

public String toString() {
	return String.format("HelloWorldBean [msg=%s]", msg);
}
}
