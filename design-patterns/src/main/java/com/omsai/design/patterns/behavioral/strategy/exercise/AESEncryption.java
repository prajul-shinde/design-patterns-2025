package com.omsai.design.patterns.behavioral.strategy.exercise;

public class AESEncryption implements Encryption {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES algorithm");
    }
}
