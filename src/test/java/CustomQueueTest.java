import CustomException.EmptyQueueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

//
//    private CustomQueue createQueue() {
//        CustomQueue customQueue = new CustomQueue();
//        customQueue.enqueue("test0");
//        customQueue.enqueue("test1");
//        return customQueue;
//    }
//
//    @Test
//    void testEnqueue() {
//        CustomQueue customQueue = createQueue();
//
//        assertEquals("test0", customQueue.peek());
//    }
//
//    @Test
//    void testPeek() {
//        CustomQueue customQueue = createQueue();
//
//        assertEquals("test0", customQueue.peek());
//    }
//
//    @Test
//    void testPeekWhenQueueIsEmpty() {
//        CustomQueue customQueue = new CustomQueue();
//
//        assertThrows(EmptyQueueException.class, () -> customQueue.peek());
//    }
//
//    @Test
//    void testDequeue() {
//        CustomQueue customQueue = createQueue();
//
//
//        assertEquals("test0", customQueue.dequeue());
//        assertEquals("test1", customQueue.peek());
//    }
//
//    @Test
//    void testDequeueWhenQueueIsEmpty() {
//        CustomQueue customQueue = new CustomQueue();
//
//        assertThrows(EmptyQueueException.class, () -> customQueue.dequeue());
//    }
//
//    @Test
//    void testGetSize() {
//        CustomQueue customQueue = createQueue();
//
//        assertEquals(2, customQueue.getQueueSize());
//    }
//
//    @Test
//    void testGetSizeAfterRemoveElement() {
//        CustomQueue customQueue = createQueue();
//
//        customQueue.dequeue();
//
//        assertEquals(1, customQueue.getQueueSize());
//    }
//
//    @Test
//    void testIsEmptyWhenQueueIsEmpty() {
//        CustomQueue customQueue = new CustomQueue();
//
//        assertEquals(true, customQueue.isEmpty());
//    }
//
//    @Test
//    void testIsEmptyWhenQueueIsNotEmpty() {
//        CustomQueue customQueue = createQueue();
//
//        assertEquals(false, customQueue.isEmpty());
//    }
//
//    @Test
//    void testIfDequeueMethodThrowsExceptionWhenRemoveAllElements() {
//        CustomQueue customQueue = createQueue();
//
//        customQueue.dequeue();
//        customQueue.dequeue();
//
//        assertThrows(EmptyQueueException.class, () -> customQueue.dequeue());
//    }

    @Test
    void test() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test8", 8);
        customQueue.enqueue("test0", 5);
        customQueue.enqueue("test1", 7);
        customQueue.enqueue("test10", 10);

        assertEquals("test10", customQueue.dequeue());
        assertEquals("test8", customQueue.dequeue());
        assertEquals("test1", customQueue.dequeue());

    }
}