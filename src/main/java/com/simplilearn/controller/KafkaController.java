package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.services.KafkaSender;

@RestController
public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;
	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message successfuly produced to Kafka";
	}
}
