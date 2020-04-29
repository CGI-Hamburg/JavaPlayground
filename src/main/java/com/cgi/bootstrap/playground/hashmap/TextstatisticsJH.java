package com.cgi.bootstrap.playground.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextstatisticsJH {

    private final String fileName;


    public static void main(String[] args) {
        TextstatisticsJH statistics = new TextstatisticsJH("taucher.txt");

        HashMap<String, Integer> wordCount = statistics.wordCount();
        System.out.println(wordCount);


    }

    public TextstatisticsJH(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<String, Integer> wordCount() {

        HashMap<String, Integer> wordCount = new HashMap<>();
        //HashMap<String, Integer> topTen = new HashMap<>();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getClassLoader().getResourceAsStream(fileName))
        );

        reader
                .lines()
                .flatMap(l -> Arrays.stream(l.split("[:\\?,\\.\\-\\! \\t\\r\\n–]")))
                .filter(w -> !w.isBlank())
                .forEach(word -> {
                    Integer count = wordCount.get(word);
                    if (Objects.isNull(count)) {
                        count = 1;
                    } else {
                        count += 1;
                    }
                    wordCount.put(word, count);

                });


        return wordCount;
    }


}