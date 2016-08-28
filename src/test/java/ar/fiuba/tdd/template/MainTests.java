package ar.fiuba.tdd.template;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {

    MyQueue queue;

    @Before
    public void setUp() {
        queue = new MyQueue<Integer>();
    }

    @Test
    public void dummy() {
        assertEquals(queue.size(), 0);
        assertEquals(queue.size(), 1);

    }
}
