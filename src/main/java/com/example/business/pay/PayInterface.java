package com.example.business.pay;

public interface PayInterface<T, V> {
    T getDto(V value);
}
