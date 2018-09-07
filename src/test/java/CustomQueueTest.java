import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    @Test
    void testEnqueue() {
        CustomQueue customQueue = new CustomQueue();
        customQueue.enqueue("test");

        assertEquals("test", customQueue.peek());
    }
}