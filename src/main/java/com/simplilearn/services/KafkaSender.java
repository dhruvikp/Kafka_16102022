package com.simplilearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	public static final String TOPIC = "simplilearn";

	public void send(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
}
