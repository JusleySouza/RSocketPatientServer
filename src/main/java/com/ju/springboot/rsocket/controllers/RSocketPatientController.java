package com.ju.springboot.rsocket.controllers;

import org.springframework.stereotype.Controller;

import com.ju.springboot.rsocket.model.ClinicalData;
import com.ju.springboot.rsocket.model.Patient;

import reactor.core.publisher.Mono;

@Controller
public class RSocketPatientController {

	public Mono<ClinicalData> requestResponse(Patient patient){
		return Mono.just(new ClinicalData(90, "80/120"));
		
	}
	
}
