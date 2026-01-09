package com.omsai.design.patterns.behavioral.command.editor;

public interface UndoableCommand extends Command {

    void unexecute();
}
