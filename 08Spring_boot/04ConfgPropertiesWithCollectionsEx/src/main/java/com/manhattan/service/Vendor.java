package com.manhattan.service;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//component//what happens if i give @comp
public class Vendor {
	private int id;
	private String Vname;
	private Set products;

}

