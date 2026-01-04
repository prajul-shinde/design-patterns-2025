package com.omsai.design.patterns.behavioral.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter to image: " + fileName);
    }
}
