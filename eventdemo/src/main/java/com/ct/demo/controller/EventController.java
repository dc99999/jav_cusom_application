package com.ct.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EventController {
	@Autowired
	Configuration config;

	@PostMapping("/testevent") 
	public ResponseEntity<Object> testServiceCall(@RequestBody Object request) {
		log.info(" Request from CT is ...."+request);
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String stringRequest = mapper.writeValueAsString(request);
			log.info(" Request converted "+stringRequest);
		}catch (Exception e) {
			log.error(" Request convertion Exception ",e);
			e.printStackTrace();
		}
		
		try {
			log.info(" Confing 1 Project Key :  "+config.getCtpProjectId());
			log.info(" Confing 2 CTP_CLIENT_ID  : "+config.getCtpProjectClinetId());
			log.info(" Confing 3 ctpProjectSecret "+config.getCtpProjectSecret());
			log.info(" Confing 4 pubSubTopic "+config.getPubSubTopic());
			log.info(" Confing 5 pubSubTopic "+config.getPubSubProject());
		}catch (Exception e) {
			log.error(" Confing convertion Exception ",e);
		}
		return ResponseEntity.ok("Tested SUcces");
	}
	
}
