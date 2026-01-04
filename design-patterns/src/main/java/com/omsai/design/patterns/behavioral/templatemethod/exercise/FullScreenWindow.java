package com.omsai.design.patterns.behavioral.templatemethod.exercise;

public class FullScreenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("before closing full screen window");
    }

    @Override
    protected void afterClose() {
        System.out.println("after closing full screen window");
    }
}
