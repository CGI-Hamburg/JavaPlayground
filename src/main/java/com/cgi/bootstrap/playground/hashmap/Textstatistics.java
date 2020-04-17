package com.cgi.bootstrap.playground.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;

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

        reader.lines()
                .forEach( (l) -> {
                    System.out.print(l.length() + " - ");
                    System.out.println(l);
                } );

    }
}
