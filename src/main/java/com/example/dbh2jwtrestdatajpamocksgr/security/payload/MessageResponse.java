package com.example.dbh2jwtrestdatajpamocksgr.security.payload;

public class MessageResponse {

    private String message;

    public MessageResponse() {
    }
    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}