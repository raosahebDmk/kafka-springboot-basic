package com.example.kafkaspringbootbasic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	/*
	 * public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
	 * this.kafkaTemplate = kafkaTemplate; }
	 */
	
	public void sendMessage(String message)
	{
		System.out.println("Producer Message : "+message);
		kafkaTemplate.send("myTopic",message);
	}
}
