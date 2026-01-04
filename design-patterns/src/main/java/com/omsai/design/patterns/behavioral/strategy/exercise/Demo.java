package com.omsai.design.patterns.behavioral.strategy.exercise;

public class Demo {

    public static void main(String[] args) {

        ChatClient client = new ChatClient();
        client.send("Hi", new AESEncryption());
        client.send("Hello", new DESEncryption());
    }
}
