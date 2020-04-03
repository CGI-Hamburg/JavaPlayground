package com.cgi.bootstrap.playground;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapÜbung {
    static Map<Integer, Integer> fibonacci = Collections.synchronizedMap(new ConcurrentHashMap<>());

    static int fibo(Integer i) {
        return fibonacci.computeIfAbsent(i, n -> fibo(n - 1) + fibo(n - 2));
    }

    public static void main(String[] args) {
        fibonacci.put(0, 1);
        fibonacci.put(1, 1);
        //fibonacci.computeIfAbsent(0, i--> 1, 1,
        for (int i = 0; i < 18; i++) {
            System.out.println(fibo(i));
        }
    }

}