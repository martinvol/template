package ar.fiuba.tdd.template;

import ar.fiuba.tdd.tp0.Queue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {

    Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<Integer>();
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

    @Test(expected = AssertionError.class)
    public void testRemoveFromEmpty() {
        assertEquals(queue.isEmpty(), true);
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void testTopFromEmpty() {
        queue.top();
    }

}
