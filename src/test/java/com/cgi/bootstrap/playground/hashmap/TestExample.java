package com.cgi.bootstrap.playground.hashmap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Map;


public class TestExample {

    private Textstatistics statistics;

    @Before
    public void setUp(){
        statistics = new Textstatistics();
    }

    @After
    public void tearDown(){
        statistics = null;
    }

    @Test
    public void shouldCountNonexistingWords(){
        // given
        final BufferedReader reader = new BufferedReader(new StringReader("Es ist mir eine Freude."));

        // when
        Map<String, Integer> wordCount = statistics.wordCount(reader);

        // then
        assertNull(wordCount.get("hallo"));
    }

    @Test
    public void shouldCountMultipleWords(){
        // given
        final BufferedReader reader = new BufferedReader(new StringReader("Es ist mir eine Freude. Und Freude ist toll."));

        // when
        Map<String, Integer> wordCount = statistics.wordCount(reader);

        // then
        assertEquals(2, wordCount.get("ist").intValue());
        assertEquals(1, wordCount.get("mir").intValue());
        assertEquals(2, wordCount.get("freude").intValue());
        assertEquals(1, wordCount.get("und").intValue());
    }
}
