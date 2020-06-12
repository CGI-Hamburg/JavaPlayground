package com.cgi.bootstrap.playground.hashmap;

import junit.framework.TestCase;
import org.junit.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Aufgabe:
 *
 * Die Klasse java.lang.String hat unter anderem die Methoden
 * toLowerCase und toUpperCase.
 *
 * Wir wollen eigentlich testen, ob für alle Strings s gilt, dass
 * s.toLowerCase() == s.toUpperCase().toLowerCase()
 *
 * Dieses "für alle" lässt sich allerdings nicht einfach testen. Die Aufgabe
 * hier ist nun, baut einen Test
 */
public class StringTester {

    String[] s;

    @Before
    public void before(){
        //System.out.println("Spaßbremse".toUpperCase().toLowerCase());
        s = new String[]{
                "hello",
                "huhu",
                "Sahne",
                "Na?",
                "blah",
                "blub",
                "0815",
                "Nullacht/fünfzehn",
                "Spaßbremse",
                "Ü"
        };
    }

    @Test
    public void t01(){
        for(String x : s) {
            assertEquals(x.toLowerCase(), x.toUpperCase().toLowerCase());
        }
    }

    @After
    public void after(){
        s = null;
    }
}
