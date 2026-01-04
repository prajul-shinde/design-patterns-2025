package com.omsai.design.patterns.behavioral.iterator.exercise;

public class Demo {

    public static void main(String[] args) {

        var productsCollection = new ProductCollection();
        productsCollection.add(new Product(1, "pen"));
        productsCollection.add(new Product(2, "pencil"));

        var iterator = productsCollection.createIterator(productsCollection);
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
