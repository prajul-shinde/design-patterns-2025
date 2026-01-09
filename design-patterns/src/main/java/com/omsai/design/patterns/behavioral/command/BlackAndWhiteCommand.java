package com.omsai.design.patterns.behavioral.command;

import com.omsai.design.patterns.behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter applied");
    }
}
