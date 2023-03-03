package com.example.kafkaspringbootbasic.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "myTopic", groupId = "myGroup")
	public void consumer(String message)
	{
		System.out.println("Consumer : "+message);
	}
	
}
