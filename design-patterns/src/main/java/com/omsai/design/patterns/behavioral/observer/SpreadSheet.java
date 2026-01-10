package com.omsai.design.patterns.behavioral.observer;

public class SpreadSheet implements Observer{

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("spreadsheet got notified " + dataSource.getValue());
    }
}
