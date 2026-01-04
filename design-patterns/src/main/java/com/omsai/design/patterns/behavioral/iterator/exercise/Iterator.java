package com.omsai.design.patterns.behavioral.iterator.exercise;

public interface Iterator<T> {

    boolean hasNext();

    void next();

    T current();
}
