package com.ju.springboot.rsocket.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.ju.springboot.rsocket.model.ClinicalData;
import com.ju.springboot.rsocket.model.Patient;

import reactor.core.publisher.Mono;

@Controller
public class RSocketPatientController {
	
	Logger logger = LoggerFactory.getLogger(RSocketPatientController.class);

	@MessageMapping("get-patient-data")
	public Mono<ClinicalData> requestResponse(Patient patient){
		logger.info("Received Patient: " + patient);
		return Mono.just(new ClinicalData(90, "80/120"));
		
	}
	
}
