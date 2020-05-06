import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.galvanize.Stack;

public class StackTestCase {

    @Test()
    @DisplayName("Stack.push() adds a new object")
    public void testStackPush() {
        Stack newStack = new Stack();
        assertEquals(0, newStack.count());
        newStack.push(100);
        assertEquals(1, newStack.count());
        assertFalse(newStack.empty);
    }

    @Test
    @DisplayName("Stack.pop() removes and returns last item added.")
    public void testStackPopRemovesAndReturnsLastItemIn() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        assertEquals(3, newStack.count());
        Object item = newStack.pop();
        assertEquals(2, newStack.count());
        assertEquals(3, item);
    }

    @Test
    @DisplayName("Stack.peek() returns the last item added without removing it.")
    public void testStackPeek() {
        Stack newStack = new Stack();
        newStack.push("sock");
        newStack.push("shoe");
        assertEquals("shoe", newStack.peek());
    }
}
