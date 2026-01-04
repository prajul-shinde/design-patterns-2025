package com.omsai.design.patterns.behavioral.templatemethod.exercise;

public class HiddenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("before closing hidden window");
    }

    @Override
    protected void afterClose() {
        System.out.println("after closing hidden window");
    }
}
