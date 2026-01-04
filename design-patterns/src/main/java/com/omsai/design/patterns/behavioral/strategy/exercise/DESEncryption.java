package com.omsai.design.patterns.behavioral.strategy.exercise;

public class DESEncryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using DES algorithm");
    }
}
