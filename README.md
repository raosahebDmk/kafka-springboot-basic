# kafka-springboot-basic
------------------------
##1.  zookeep run 
###  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 

##2.  kafka server run 
### .\bin\windows\kafka-server-start.bat .\config\server.properties

### we can test message on command promt producer and conusmer.

##3.  producer 
###.\bin\windows\kafka-console-producer.bat --topic myTopic --bootstrap-server localhost:9092 

##4.  consumer 
###.\bin\windows\kafka-console-consumer.bat --topic myTopic --from-beginning --bootstrap-server localhost:9092
