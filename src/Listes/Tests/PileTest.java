package Listes.LISTS.TESTS;

import Listes.File;
import Listes.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {

    Pile<String> test=new Pile<>();

    @BeforeEach
    void setUp() {
        test.push("a");
        test.push("b");
        test.push("c");
    }

    @Test
    void push() {
        assertEquals("c",test.peek()
        );
    }

    @Test
    void pop() {
        test.pop("c");
        test.push("a");
        assertEquals("a",test.peek());
    }

    @Test
    void peek() {assertEquals("c",test.peek());
    }

    @Test
    void clear() {test.clear();
        assertEquals(0,test.size());
    }

    @Test
    void size() {
        assertEquals(3,test.size());
    }

}