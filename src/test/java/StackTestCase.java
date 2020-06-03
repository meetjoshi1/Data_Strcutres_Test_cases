import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.galvanize.Stack;
import com.galvanize.Node;

class StackTestCase {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void testStackEmptyTrue() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void testStackPushNode () {
        stack.push(new Node(100));
        assertEquals(1, stack.count());
    }

    @Test
    void testStackPopRemovesNode_LIFO() {
        stack.push(new Node(200));
        stack.push(new Node(300));
        Node lastIn = new Node(400);
        stack.push(lastIn);
        assertEquals(3, stack.count());

        Node firstOut = stack.pop();
        assertEquals(2, stack.count());
        assertEquals(lastIn, firstOut);
    }

    @Test
    void testStackPeekReturnsTopNode() {
        Node item = new Node(200);
        Node topItem = new Node(300);
        stack.push(item);
        stack.push(topItem);
        Node peekItem = stack.peek();
        assertEquals(topItem, peekItem);
    }

    @Test
    void testNodesEqual() {
        Node treeNode = new Node("Tree");
        Node node1 = new Node("Tree");
        assertEquals(treeNode, node1);
        Node bushNode = new Node("Bush");
        assertNotEquals(treeNode, bushNode);
    }
}
