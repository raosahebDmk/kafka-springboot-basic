# kafka-springboot-basic
------------------------
1.  zookeep run 

  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 

2.  kafka server run 

 .\bin\windows\kafka-server-start.bat .\config\server.properties

  we can test message on command promt producer and conusmer.

3.  producer 

  .\bin\windows\kafka-console-producer.bat --topic myTopic --bootstrap-server localhost:9092 

4.  consumer 
  .\bin\windows\kafka-console-consumer.bat --topic myTopic --from-beginning --bootstrap-server localhost:9092
  
  
### application.yaml
spring:
  kafka:
    consumer:
      bootstrap-servers:
      - localhost:9092
      group-id: myGroup
      auto-offset-reset: earliest
      key-deserializer:
        org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer:
        org.apache.kafka.common.serialization.StringDeserializer
    producer:
      bootstrap-servers:
      - localhost:9092
      key-serializer:
        org.apache.kafka.common.serialization.StringSerializer
      value-serializer:
        org.apache.kafka.common.serialization.StringSerializer
