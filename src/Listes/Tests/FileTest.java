package Listes.LISTS.TESTS;

import Listes.File;
import Listes.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    File<String> test = new File<>();
    @BeforeEach
    void setUp() {
        test.add("v");
        test.add("q");
        test.add("1");
    }

    @Test
    void add()
    {test.add("4");
        test.remove();test.remove();test.remove();
        assertEquals((String)"4",test.peek().getContenu());
    }

    @Test
    void remove() {
        test.remove();
        assertEquals((String)"q",test.peek().getContenu());

    }

    @Test
    void peek() {
        assertEquals((String)"v",test.peek());

    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0,test.size());

    }

    @Test
    void size() {
        assertEquals(3,test.size());
    }

}