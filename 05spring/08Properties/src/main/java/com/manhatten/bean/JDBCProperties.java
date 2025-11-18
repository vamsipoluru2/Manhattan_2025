package com.manhatten.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jobj")
public class JDBCProperties {

	@Value("${my.jdbc.DriverName}")//$ to read the values form the properties file
	private String Drivername;
	@Value("${my.jdbc.url}")
	private String url;
	@Value("${my.jdbc.username}")
	private String username ;
	@Value("${my.jdbc.password}")
	private String password;

	
	public void setDrivername(String drivername) {
		Drivername = drivername;
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
	@Override
	public String toString() {
		return "JDBCProperties [Drivername=" + Drivername + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
