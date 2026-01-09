package com.omsai.design.patterns.behavioral.command.editor;

public class Demo {

    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World!");

        var command = new BoldCommand(document, history);
        command.execute();
        System.out.println(document.getContent());
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
