package com.omsai.design.patterns.behavioral.command;

import com.omsai.design.patterns.behavioral.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
