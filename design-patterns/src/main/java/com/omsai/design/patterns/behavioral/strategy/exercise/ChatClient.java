package com.omsai.design.patterns.behavioral.strategy.exercise;

public class ChatClient {

    public void send(String message, Encryption encryption) {
        encryption.encrypt(message);
        System.out.println("message sent ");
    }
}
