import com.galvanize.Node;
import com.galvanize.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTestCase {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void testEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void testAddNodeToQueue() {
        Node node = new Node(1);
        queue.enqueue(node);
        assertEquals(1, queue.length());
    }

    @Test
    void testEnqueueManyNodes_FIFO() {
        Node firstNode = new Node("A");
        queue.enqueue(firstNode);
        queue.enqueue(new Node("B"));
        queue.enqueue(new Node("C"));
        assertEquals(3, queue.length());
        assertEquals(firstNode, queue.getFront());
        assertEquals("C", queue.getRear().getValue());
    }

    @Test
    void testDequeueOneNode_FIFO() {
        Node firstIn = new Node("A");
        Node secondIn = new Node("B");
        queue.enqueue(firstIn);
        queue.enqueue(secondIn);
        queue.enqueue(new Node("C"));
        Node firstOut = queue.dequeue();
        assertEquals(firstIn, firstOut);
        assertEquals(secondIn, queue.getFront());
    }

    @Test
    void testPeek() {
        Node firstIn = new Node("A");
        Node secondIn = new Node("B");
        queue.enqueue(firstIn);
        queue.enqueue(secondIn);
        assertEquals(firstIn, queue.peek());
        assertEquals(2, queue.length());
    }
}
