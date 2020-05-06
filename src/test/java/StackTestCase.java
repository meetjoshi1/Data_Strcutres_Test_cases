import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.galvanize.Stack;

class StackTestCase {

    @Test()
    @DisplayName("Stack.push() adds a new object")
    void testStackPush() {
        Stack newStack = new Stack();
        assertEquals(0, newStack.count(),"Stack should be empty on initialization");
        newStack.push(100);
        assertEquals(1, newStack.count(), "Stack should contain only 1 object.");
        assertFalse(newStack.empty, "Stack should not be empty.");
    }

    @Test
    @DisplayName("Stack.pop() removes and returns last item added.")
    void testStackPopRemovesAndReturnsLastItemIn() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        assertEquals(3, newStack.count(), "Stack should contain 3 objects.");
        Object item = newStack.pop();
        assertEquals(2, newStack.count(), "Stack should contain only 2 items after .pop()");
        assertEquals(3, item, "The removed object should have a value of 3");
    }

    @Test
    @DisplayName("Stack.peek() returns the last item added without removing it.")
    void testStackPeek() {
        Stack newStack = new Stack();
        newStack.push("sock");
        newStack.push("shoe");
        assertEquals("shoe", newStack.peek(), "The last object should be 'shoe'.");
        assertEquals(2, newStack.count(), "The stack size should be unchanged after peek().");
    }
}
