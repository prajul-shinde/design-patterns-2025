package com.omsai.design.patterns.behavioral.mommento.exercise;

public class Demo {

    public static void main(String[] args) {
        var document = new Document("a", "arial", 17);
        var history = new DocumentHistory();
        history.push(document.createState());

        document = new Document("b", "italic", 17);
        history.push(document.createState());

        document = new Document("c", "roboto", 17);

        history.getStates().forEach(System.out::println);
        document.restore(history.pop());
        document.restore(history.pop());
        System.out.println(document);
    }
}
