package com.example.producer.dto;

public class UserEvent {
    private String userId;
    private String message;
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public UserEvent() {}
    public UserEvent(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }
    // (toString() để log cho đẹp)
    @Override
    public String toString() {
        return "UserEvent{" + "userId='" + userId + '\'' + ", message='" + message + '\'' + '}';
    }
} 
    
