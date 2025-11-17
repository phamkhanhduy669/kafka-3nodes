package com.example.consumer;
import com.example.consumer.dto.UserEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener {

    @KafkaListener(topics = "user-events", groupId = "user-event-group")
    public void handleUserEvent(UserEvent event) {
        // Xử lý message nhận được
        System.out.println("Received message: " + event.toString());
        // ... (ví dụ: lưu vào database, v.v...)
    }
}