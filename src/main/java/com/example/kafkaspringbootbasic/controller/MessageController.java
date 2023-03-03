package com.example.kafkaspringbootbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaspringbootbasic.services.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	/*
	 * public MessageController(KafkaProducer kafkaProducer) { this.kafkaProducer =
	 * kafkaProducer; }
	 */
	
	@GetMapping("/publish")
	public ResponseEntity<String> sendMessage(@RequestParam("message") String message)
	{
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message send to Topic");
	}

}
