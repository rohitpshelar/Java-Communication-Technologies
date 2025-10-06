1. Make sure Docker is installed and running on your machine.
2. Run yaml file (TO start kafka on docker)
3. To Open Docker bash terminal
   ```bash
   docker exec -it <container_id> bash
   ```   
   ```bash
   docker exec -it kafka bash
   ```
4. To Create Topic
   ```bash
   kafka-topics --create --topic <topic_name> --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
   ```   
5. Example
   ```bash
    #Delete all topics
    kafka-topics --bootstrap-server localhost:9092 --delete --topic '.*'
   
    #List all topics  
    kafka-topics --bootstrap-server localhost:9092 --list
   
    #Create Topic named string-topic
    kafka-topics --create --topic string-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
   
    #Describe Topic named string-topic
    kafka-topics --describe --topic string-topic --bootstrap-server localhost:9092
    
    #Produce Messages
    kafka-console-producer --bootstrap-server localhost:9092 --topic string-topic
    
    #Consume Messages from Beginning
    kafka-console-consumer --bootstrap-server localhost:9092 --topic string-topic --from-beginning 
    
    #Consume Messages with Group
    kafka-console-consumer --bootstrap-server localhost:9092 --topic string-topic --group string-topic-group
    
   ```