package com.nareshit.controller;

import java.net.URISyntaxException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.nareshit.proxy.ApiProxy;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ApiProxy proxy;
	
	@PostMapping(value="/regDoctor")
	public String addDoctor(@RequestBody String payLoad) {
		System.out.println("add Doctor");
		
		String hospId = "";
		JSONObject json = new JSONObject(payLoad);
		
		if(json.has("hospId")) {
			hospId = json.getString("hospId");
		}else {
			System.out.println("");
		}
		if(hospId != null && !hospId.isEmpty()) {
			String hospInfo = proxy.getHospInfo(Integer.valueOf(hospId));
			if(hospInfo != null && !hospInfo.isEmpty()) {
				String doctPayLoad;
				try {
					doctPayLoad = proxy.addDoctor(payLoad);
					if(doctPayLoad != null) {
						return doctPayLoad;
					}
				} catch (RestClientException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
			
		
		
		return null;
	}
	
	
	
}

	