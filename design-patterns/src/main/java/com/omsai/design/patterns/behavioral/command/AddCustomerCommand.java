package com.omsai.design.patterns.behavioral.command;

import com.omsai.design.patterns.behavioral.command.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
