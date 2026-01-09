package com.omsai.design.patterns.behavioral.command.exercise;

public interface UndoableCommand extends Command {

    void unexecute();
}
