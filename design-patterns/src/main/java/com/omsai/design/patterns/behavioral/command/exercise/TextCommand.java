package com.omsai.design.patterns.behavioral.command.exercise;

public class TextCommand implements UndoableCommand {

    private String text;
    private VideoEditor videoEditor;
    private History history;

    public TextCommand(String text, VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
        this.text = text;
    }

    @Override
    public void unexecute() {
        videoEditor.removeText();
    }

    @Override
    public void execute() {
        history.push(this);
        videoEditor.setText(text);
    }
}
