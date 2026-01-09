package com.omsai.design.patterns.behavioral.command;

import com.omsai.design.patterns.behavioral.command.fx.Button;

public class Demo {

    public static void main(String[] args) {

        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);
        button.click();
    }
}
