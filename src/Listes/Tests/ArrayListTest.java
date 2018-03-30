package Listes.Tests;

import Listes.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    ArrayList<String> arrayList= new ArrayList<>(1);

    @BeforeEach
    void setUp() {
        arrayList.add("patate");
        arrayList.add("papapa");
    }

    @Test
    void set() {
        arrayList.set(0,"Mauve");
        assertEquals((String)"Mauve",arrayList.get(0));
        arrayList.set(1,"jaune");
        assertEquals((String)"jaune",arrayList.get(1));
    }

    @Test
    void add() {
        arrayList.add("poil");
        assertEquals((String)"poil",arrayList.get(3));
        arrayList.add("poil");
        arrayList.clear();
        arrayList.add("poil");
        assertEquals((String)"poil",arrayList.get(0));

    }

    @Test
    void get() {
        assertEquals((String)"patate",arrayList.get(0));
    }

    @Test
    void add1() {
        arrayList.add(0,"choux");
        arrayList.add(1,"mah");
        arrayList.add(2,"hahah");
        assertEquals((String)"choux",arrayList.get(0));

    }

    @Test
    void remove() {
        arrayList.remove(0);
        assertEquals((String)"jaune",arrayList.get(0));
        assertEquals((String)"rouge",arrayList.get(1));
    }

    @Test
    void clear() {
        arrayList.clear();
        arrayList.add("pilele");
        assertEquals((String)"pilele",arrayList.get(0));
    }

    @Test
    void size() {
        assertEquals(2,arrayList.size());
    }}
