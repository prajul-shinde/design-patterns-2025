package com.omsai.design.patterns.behavioral.command;

import com.omsai.design.patterns.behavioral.command.fx.Button;

public class CompositeDemo {

    public static void main(String[] args) {
        var compositeCommand = new CompositeCommand();
        var resizeCommand = new ResizeCommand();
        var blackAndWhiteFilter = new BlackAndWhiteCommand();
        compositeCommand.addCommand(resizeCommand);
        compositeCommand.addCommand(blackAndWhiteFilter);
        var button = new Button(compositeCommand);
        button.click();
    }
}
