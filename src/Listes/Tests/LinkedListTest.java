package Listes.Tests;

import Listes.LinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList<String> test = new LinkedList<>();
    @BeforeEach
    public void setUp(){
        test.add("p");
        test.add("v");


    }

    @Test
    void set() {
        test.set(0, "2");
        assertEquals((String) "2", test.get(0));
    }

    @Test
    void add() {
        test.add("link");
        test.add("tetris");
        assertEquals((String)"link",test.get(2));
        assertEquals((String)"tetris",test.get(3));


    }

    @Test
    void get() {
        test.get(0);
        assertEquals((String)"p",test.get(0));

    }

    @Test
    void add1() {
        test.add(0,"aw");
        test.add(1,"pow");
        test.add(2,"ninja");
        assertEquals((String)"aw",test.get(0));
        assertEquals((String)"pow",test.get(1));
        assertEquals((String)"ninja",test.get(2));;
    }

    @Test
    void remove() {
        test.remove(0);
        assertEquals((String)"v",test.get(0));
    }

    @Test
    void clear() {
        test.clear();
        test.add("pomme");
        assertEquals((String)"pomme",test.get(0));
    }

    @Test
    void size() {
        test.size();
        assertEquals(2,test.size());


    }

}