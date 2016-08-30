package ar.fiuba.tdd.template;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MainTests {

    MyQueue<Integer> queue;

    @Before
    public void setUp() {
        queue = new MyQueue<Integer>();
    }

    @Test
    public void dummy() {
        assertEquals(queue.size(), 0);
        queue.add(10);
        assertEquals(queue.top(), (Integer) 10);
        assertEquals(queue.isEmpty(), false);
        assertEquals(queue.size(), 1);
        queue.add(12);
        assertEquals(queue.size(), 2);
        assertEquals(queue.top(), (Integer) 12);
        queue.remove();
        assertEquals(queue.size(), 1);
        assertEquals(queue.top(), (Integer) 12);
        queue.remove();
        assertEquals(queue.size(), 0);
        queue.add(13);
        assertEquals(queue.size(), 1);
        assertEquals(queue.top(), (Integer) 13);
        queue.remove();
        assertEquals(queue.size(), 0);

    }

    @Test(expected=NoSuchElementException.class)
    public void testRemoveFromEmpty() {
        assertEquals(queue.isEmpty(), true);
        queue.remove();
    }

    @Test(expected=NoSuchElementException.class)
    public void testTopFromEmpty() {
        queue.top();
    }

}
