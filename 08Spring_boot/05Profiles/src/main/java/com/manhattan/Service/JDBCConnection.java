package com.manhattan.Service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.man")
public class JDBCConnection {
	
	private String DriverName;
	private String Url;
	private String UserName;
	private String Password;
	
	



}
