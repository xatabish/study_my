package com.example.studyjvg.study.Lesson10;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public  class StringListExTest {

    private final StringListEx ex = new StringListEx();

    @BeforeEach
    public void setUp() {
        ex.add(0, "kirill");
        ex.add(1, "kiru");
        ex.add(2, "kira");
    }

    LinkedList<String> exm = new LinkedList<>();

    @BeforeEach
    public void setUp2() {

        exm.add(0,"kirill");
        exm.add(1, "kiru");
        exm.add(2, "kira");
    }

    @Ignore
    @Test
    void add() {
        var expected = ex.add("kirill");
        var actual = "kirill";
        assertEquals(actual, expected);
    }
    @Ignore
    @Test
    void testAdd() {
        var expected = ex.add(0, "kirill");
        var actual = "kirill";
        assertEquals(actual, expected);
    }
    @Ignore
    @Test
    void set() {
        var expected = ex.set(0, "kira");
        var actual = "kira";
        assertEquals(actual, expected);
    }
    @Ignore
    @Test
    void remove() {
        var expected = ex.remove(0);
        var actual = "kirill";
        assertEquals(actual, expected);
    }
    @Ignore
    @Test
    void testRemove() {
        var expected = ex.remove("kirill");
        var actual = "kirill";
        assertEquals(actual, expected);
    }

    @Test
    void contains() {
        var expected = ex.contains("kirill");
        var actual = true;
        assertEquals(actual, expected);
    }

    @Test
    void indexOf() {
        var expected = ex.indexOf("kirill");
        var actual = 0;
        assertEquals(actual, expected);
    }

    @Test
    void lastIndexOf() {
        var expected = ex.lastIndexOf("kira");
        var actual = 2;
        assertEquals(actual, expected);
    }

    @Test
    void get() {
        var expected = ex.get(2);
        var actual = "kira";
        assertEquals(actual, expected);
    }

    @Test
    void testEquals() {
        var expected = ex.equals(exm);
        var actual = true;
        assertEquals(actual, expected);
    }

    @Test
    void size() {
        var expected = ex.size();
        var actual = 3;
        assertEquals(actual, expected);
    }

    @Test
    void isEmpty() {
        var expected = ex.isEmpty();
        var actual = false;
        assertEquals(actual, expected);
    }

    @Test
    void clear() {
        ex.clear();
        var expected = ex.size();
        var actual = 0;
        assertEquals(actual, expected);
    }

    @Test
    void toArray() {
        var expected = ex.toArray();
        var  actual = new String[]{"kirill", "kiru", "kira"};
        assertArrayEquals(expected, actual);
    }
}