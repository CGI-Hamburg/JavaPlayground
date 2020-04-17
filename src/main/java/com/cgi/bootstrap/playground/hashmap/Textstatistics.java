package com.cgi.bootstrap.playground.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Arrays;

public class Textstatistics {

    private final String fileName;

    public static void main(String [] args){
        Textstatistics statistics = new Textstatistics("taucher.txt");

        statistics.wordCount();
    }

    public Textstatistics(String fileName){
        this.fileName = fileName;
    }

    public void wordCount(){

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getClassLoader().getResourceAsStream(fileName))
        );

        reader
                .lines()
                .flatMap( l -> Arrays.stream(l.split("[:\\?,\\.\\-\\! \\t\\r\\n]")))
                .filter(w -> !w.isBlank())
                .forEach(System.out::println);

    }
}
