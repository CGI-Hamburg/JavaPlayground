package com.cgi.bootstrap.playground.hashmap;

import java.util.HashMap;

public class TextstatisticsJHTest {
    public static void main(String[] args) {
        TextstatisticsJH statistics = new TextstatisticsJH("taucher.txt");
        HashMap<String, Integer> wordCount = statistics.wordCount();
        System.out.println(wordCount);

        assert(wordCount.get("ist") == 7);

    }

}
