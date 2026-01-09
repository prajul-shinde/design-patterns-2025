package com.omsai.design.patterns.behavioral.command.exercise;

public class Demo {

    public static void main(String[] args) {
        var history = new History();
        var editor = new VideoEditor();
        var textCommand = new TextCommand("Hello", editor, history);
        textCommand.execute();
        System.out.println(editor);
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor);
    }
}
