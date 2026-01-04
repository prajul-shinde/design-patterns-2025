package com.omsai.design.patterns.behavioral.templatemethod;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
