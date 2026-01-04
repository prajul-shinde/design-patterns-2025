package com.omsai.design.patterns.behavioral.strategy;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high contrast filter to image: " + fileName);
    }
}
