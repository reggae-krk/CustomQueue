import CustomException.EmptyQueueException;
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

        assertEquals("test0", customQueue.peek());
    }

    @Test
    void testPeekWhenQueueIsEmpty() {
        CustomQueue customQueue = new CustomQueue();

        assertThrows(EmptyQueueException.class, () -> customQueue.peek());
    }

    @Test
    void testDequeue() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");
        customQueue.enqueue("test1");


        assertEquals("test0", customQueue.dequeue());
        assertEquals("test1", customQueue.peek());
    }

    @Test
    void testDequeueWhenQueueIsEmpty() {
        CustomQueue customQueue = new CustomQueue();

        assertThrows(EmptyQueueException.class, () -> customQueue.dequeue());
    }

    @Test
    void testGetSize() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");
        customQueue.enqueue("test1");

        assertEquals(2, customQueue.getQueueSize());
    }

    @Test
    void testGetSizeAfterRemoveElement() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");
        customQueue.enqueue("test1");

        customQueue.dequeue();

        assertEquals(1, customQueue.getQueueSize());
    }

    @Test
    void testIsEmptyWhenQueueIsEmpty() {
        CustomQueue customQueue = new CustomQueue();

        assertEquals(true, customQueue.isEmpty());
    }

    @Test
    void testIsEmptyWhenQueueIsNotEmpty() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");

        assertEquals(false, customQueue.isEmpty());
    }

    @Test
    void testIfDequeueMethodThrowsExceptionWhenRemoveAllElements() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test0");

        customQueue.dequeue();

        assertThrows(EmptyQueueException.class, () -> customQueue.dequeue());
    }
}