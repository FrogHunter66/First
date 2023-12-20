package ru.mirea.lab18.task1;

import java.io.Serializable;

public class Params_Class<T extends String & Comparable<String>, V extends animal & Serializable, K> {
    T t;
    V v;
    K k;
    Params_Class(T t,V v,K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return t.getClass() + " " + v.getClass() + " " + k.getClass();
    }
}
