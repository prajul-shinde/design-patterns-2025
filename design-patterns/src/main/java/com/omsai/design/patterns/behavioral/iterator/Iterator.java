package com.omsai.design.patterns.behavioral.iterator;

public interface Iterator<T> {

    boolean hasNext();

    T current();

    void next();
}
