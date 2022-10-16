package com.simplilearn.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {

	
	@KafkaListener(topics="simplilearn", groupId="group1")
	public void consume(String message) {
		System.out.println("Consumer1 Received message :"+message);
	}
	
	@KafkaListener(topics="simplilearn", groupId="group2")
	public void consume1(String message) {
		System.out.println("Consumer2 Received message :"+message);	
	}
}
