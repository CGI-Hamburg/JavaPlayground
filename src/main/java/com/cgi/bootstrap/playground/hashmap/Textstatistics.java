package com.cgi.bootstrap.playground.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Textstatistics {

    private final String fileName;

    public static void main(String [] args){
        Textstatistics statistics = new Textstatistics("taucher.txt");

        Map<String, Integer> wordCount = statistics.wordCount();

        wordCount.forEach((k,v)->System.out.println(k+":"+v));

    }

    public Textstatistics(String fileName){
        this.fileName = fileName;
    }

    public Map<String, Integer> wordCount(){

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getClassLoader().getResourceAsStream(fileName))
        );

        return reader
                .lines()
                .flatMap( l -> Arrays.stream(l.split("[:\\?,\\.\\-–\\! \\t\\r\\n]")))
                .filter(w -> !w.isBlank())
                .collect(Collectors.toMap(w -> w, w -> Integer.valueOf(1), (v1, v2)-> v1 + v2));
    }


}
