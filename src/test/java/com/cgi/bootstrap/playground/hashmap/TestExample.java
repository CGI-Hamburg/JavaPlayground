package com.cgi.bootstrap.playground.hashmap;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static com.cgi.bootstrap.playground.hashmap.TextstatisticsJHTest.assertEqual;

public class TestExample {

    private Textstatistics statistics;

    @Before
    public void setUp(){
        statistics = new Textstatistics();
    }

    public void tearDown(){
        statistics = null;
    }

    @Test
    public void should(){
        // given
        final BufferedReader reader = new BufferedReader(new StringReader("Es ist mir eine Freude."));

        // when
        Map<String, Integer> wordCount = statistics.wordCount(reader);
        System.out.println(wordCount);

        // then
        assertEqual(wordCount.get("ist").intValue(),1);
    }
}
