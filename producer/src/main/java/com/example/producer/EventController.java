package com.example.producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.producer.dto.UserEvent;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private KafkaTemplate<String, UserEvent> kafkaTemplate;

    private static final String TOPIC = "user-events";

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        String eventId = UUID.randomUUID().toString();
        UserEvent event = new UserEvent(eventId, message);
        
        kafkaTemplate.send(TOPIC, eventId, event); // Gửi message
        System.out.println("Sent: " + event);
        return "Message sent successfully: " + event;
    }
}