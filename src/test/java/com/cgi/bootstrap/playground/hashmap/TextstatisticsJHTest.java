package com.cgi.bootstrap.playground.hashmap;

import java.util.HashMap;

public class TextstatisticsJHTest {
    public static void main(String[] args) {
        TextstatisticsJH statistics = new TextstatisticsJH ("taucher.txt");
        HashMap<String, Integer> wordCount = statistics.wordCount();
        System.out.println(wordCount);

        assertEqual(wordCount.get("ist").intValue(),4);

    }

    public static boolean assertEqual(Object a, Object b){
        boolean equals = a.equals(b);
        if(!equals){
            System.out.println("Werte sind nicht gleich: " + a + " <> " + b); // TODO remove
        } else {
            System.out.println("werte sind gleich!");
        }
        return equals;
    }

    public static boolean assertEqual(int a, int b){
        boolean equals = a == b;
        if(!equals){
            System.out.println("Werte sind nicht gleich: " + a + " == " + b); // TODO remove
        } else {
            System.out.println("werte sind gleich!");
        }
        return equals;
    }

}
