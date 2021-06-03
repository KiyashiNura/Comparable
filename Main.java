package com.KiyashiNura;

import java.util.List;

class Mass<T> implements Comparable<T> {
    T val;

    public Mass(T value){
        val = value;
    }


    @Override
    public int compareTo(T o) {
        return String.valueOf(val.hashCode()).compareTo(String.valueOf(o.hashCode()));
    }
}

class Roster<T> implements Comparable<List<T>> {

    List<T> val;

    public Roster(List<T> value){
        val = value;
    }

    @Override
    public int compareTo(List<T> o) {
        String a = "", b = "";
        for (T i: o){
            a += String.valueOf(i.hashCode());
        }
        for (T i: val){
            b += String.valueOf(i.hashCode());
        }
        return a.compareTo(b);
    }
}



class Main {

    public static void main(String[] args) {
        // some code
    }
}