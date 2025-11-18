package com.manhatten.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {
	private List pName;
	private Set pId;
	private Map prod;
	private Properties p;


	
	public void setProd(Map prod) {
		this.prod = prod;
	}


	public void setP(Properties p) {
		this.p = p;
	}


	public void setpName(List pName) {
		this.pName = pName;
	}


	public void setpId(Set pId) {
		this.pId = pId;
	}


	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pId=" + pId + ", prod=" + prod + ", p=" + p + "]";
	}



	
}
