package com.omsai.design.patterns.behavioral.mommento.exercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private List<DocumentState> states = new ArrayList<>();

    public List<DocumentState> getStates() {
        return states;
    }

    public void push(DocumentState documentState) {
        states.add(documentState);
    }

    public DocumentState pop() {
        return states.removeLast();
    }

}
