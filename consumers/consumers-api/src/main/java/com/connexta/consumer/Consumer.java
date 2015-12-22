package com.connexta.consumer;

public interface Consumer<T> {
    String convertToString(T input);
}
