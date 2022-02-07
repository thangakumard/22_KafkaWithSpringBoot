package com.thangaKafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "thangaTopic", groupId = "group_01")
    void listener(String data){
        System.out.println("The event is : "+ data);
    }
}
