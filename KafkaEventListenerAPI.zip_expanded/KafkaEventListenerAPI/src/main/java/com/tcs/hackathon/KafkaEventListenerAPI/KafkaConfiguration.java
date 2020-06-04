package com.tcs.hackathon.KafkaEventListenerAPI;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

@Configuration
public class KafkaConfiguration {

	
	@Bean
	public ConsumerFactory<String,String> consumerFactory() {
		Map config=new HashMap();
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_DOC, StringDeserializer.class);
		return new DefaultKafkaConsumerFactory<String,String>(config);
				
		
	}
	
	
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> getKafkaListerner(){
		ConcurrentKafkaListenerContainerFactory kafkaFactory= new ConcurrentKafkaListenerContainerFactory<String, String>();
		kafkaFactory.setConsumerFactory(consumerFactory());
		return kafkaFactory;
	}
	
	
	
}
