package com.design.learn.practice.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration转为迭代器
 * @param <T>
 */
public class MyEnumAdapter<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public MyEnumAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
