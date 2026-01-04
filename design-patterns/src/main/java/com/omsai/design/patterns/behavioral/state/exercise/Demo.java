package com.omsai.design.patterns.behavioral.state.exercise;

public class Demo {

    public static void main(String[] args) {

        var travelMode = new Bicycling();
        System.out.println(travelMode.getEta() + ": direction- " + travelMode.getDirection());

        var walking = new Walking();
        System.out.println(walking.getEta() + ": direction- " + walking.getDirection());
    }
}
