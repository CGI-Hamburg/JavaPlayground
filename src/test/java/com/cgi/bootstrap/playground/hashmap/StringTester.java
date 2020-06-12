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
 * s.toLowerCase().toUpperCase() == s.toUpperCase().toLowerCase().toUpperCase()
 *
 * Dieses "für alle" lässt sich allerdings nicht einfach testen. Die Aufgabe
 * hier ist nun, baut einen Test
 */
public class StringTester {

    String s;

    @Before
    void before(){
        s = "huhu";
    }

    @Test
    void t01(){
        assertEquals("hello", s);
    }

    void after(){
    }
}
