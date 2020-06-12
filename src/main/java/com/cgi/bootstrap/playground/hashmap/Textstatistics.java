package com.cgi.bootstrap.playground.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Textstatistics {

    public static void main(String [] args){
        Textstatistics statistics = new Textstatistics();

        Map<String, Integer> wordCount = statistics.wordCount(createReader("taucher.txt"));
        wordCount.forEach((k,v)->System.out.println(k+":"+v));

        System.out.println("wordCount2:");
        Map<String, Integer> wordCount2 = statistics.wordCountOldStyle(createReader("taucher.txt"));
        wordCount2.forEach((k,v)->System.out.println(k+":"+v));

        System.out.println("wordCount2:");
        Map<String, Integer> wordCount3 = statistics.wordCountReallyOldStyle(createReader("taucher.txt"));
        wordCount3.forEach((k,v)->System.out.println(k+":"+v));
    }

    private static BufferedReader createReader(String filename) {
        return new BufferedReader(
                new InputStreamReader(Textstatistics.class.getClassLoader().getResourceAsStream(filename))
        );
    }

// hellooooo
    public Map<String, Integer> wordCount(BufferedReader reader){

        return reader
                .lines()
                .flatMap( l -> Arrays.stream(l.split("[:\\?,\\.\\-–\\! \\t\\r\\n]")))
                .filter(w -> !w.isBlank())
                .map(String::toLowerCase)
                .collect(Collectors.toMap(w -> w, w -> Integer.valueOf(1), (v1, v2)-> v1 + v2));
    }

    public Map<String, Integer> wordCountOldStyle(BufferedReader reader){
        Map<String, Integer> wordCount = new HashMap<>();

        String line = readLine(reader);
        while(line!=null){
            String[] words = line.split("[:\\?,\\.\\-–\\! \\t\\r\\n]");
            for(String word:words){
                if(!word.isBlank()){
                    word = word.toLowerCase();
                    wordCount.compute(word, (k, v) -> (v == null) ? 1 : v+1);
                }
            }
            line = readLine(reader);
        }
        return wordCount;
    }

    public Map<String, Integer> wordCountReallyOldStyle(BufferedReader reader){
        Map<String, Integer> wordCount = new HashMap<>();

        String line = readLine(reader);
        while(line!=null){
            String[] words = line.split("[:\\?,\\.\\-–\\! \\t\\r\\n]");
            for(String word:words){
                if(!word.isBlank()){
                    word = word.toLowerCase();
                    Integer count = wordCount.get(word);
                    count = count==null?1:count+1;
                    wordCount.put(word, count);
                }
            }
            line = readLine(reader);
        }

        return wordCount;
    }

    private String readLine(final BufferedReader reader)  {
        try {
            return reader.readLine();
        }catch(IOException x){
            return null;
        }
    }


}
