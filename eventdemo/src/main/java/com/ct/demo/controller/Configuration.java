package com.ct.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties
@Component
@Getter
@Setter
public class Configuration {
	
	@Value("${CTP_PROJECT_KEY:Test}") 
	private String ctpProjectId;
	
	@Value("${CTP_CLIENT_ID:Test_ClinetID}") 
	private String ctpProjectClinetId;
	
	@Value("${CTP_CLIENT_SECRET:Test_ClientSecret}") 
	private String ctpProjectSecret;
	
	@Value("${CONNECT_GCP_TOPIC_NAME_KEY:Test_GCP_TOPIC_KEY}") 
	private String pubSubTopic;
	
	@Value("${CONNECT_GCP_PROJECT_ID_KEY:Test_GCP_TOPIC_PROJECT_IDY}") 
	private String pubSubProject;
}
