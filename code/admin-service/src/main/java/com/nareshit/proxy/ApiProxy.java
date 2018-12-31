package com.nareshit.proxy;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiProxy {

	@Autowired
	private Environment env;
	
	public String getHospInfo(int id) {
		String getHospUri = env.getProperty("hosp-service.get.info");
		getHospUri = getHospUri+id;
		System.out.println("get hospital info uri is:\t"+getHospUri);
		
		RestTemplate rt = new RestTemplate();
		String hospData = rt.getForObject(getHospUri, String.class);
		System.out.println("hospidal info is:\t"+hospData);
		return hospData;
	}
	
	public String addDoctor(String payLoad) throws RestClientException, URISyntaxException {
		String addDoctUri = env.getProperty("doct-service.add");
		System.out.println("addDoctUri info uri is:\t"+addDoctUri);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		HttpEntity<String> entity = new HttpEntity<String>(payLoad, headers);
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resp = rt.exchange(addDoctUri, HttpMethod.POST, entity, String.class);
		
		return resp.getBody();
	}
}
