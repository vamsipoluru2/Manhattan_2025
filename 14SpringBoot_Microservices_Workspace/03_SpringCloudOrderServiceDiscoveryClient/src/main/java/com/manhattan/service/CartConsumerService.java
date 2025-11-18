package com.manhattan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartConsumerService {
	
	@Autowired
	DiscoveryClient client;
	
	public String getCartData() {
		List<ServiceInstance> list = client.getInstances("CART-SERVICE");
		ServiceInstance si = list.get(0);
		String url = si.getUri() + "/cart/msg";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.getForEntity(url, String.class);
		String response = re.getBody();
		return response;
	}

}
