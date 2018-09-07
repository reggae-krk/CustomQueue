import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    @Test
    void testEnqueue() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test");

        assertEquals("test", customQueue.peek());
    }

    @Test
    void testPeek() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");
        customQueue.enqueue("test1");

        assertEquals("test1", customQueue.peek());
    }

    @Test
    void testDequeue() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");
        customQueue.enqueue("test1");


        assertEquals("test1", customQueue.dequeue());
        assertEquals("test0", customQueue.peek());
    }
}