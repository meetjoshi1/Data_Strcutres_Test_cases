import org.junit.Test;
import static org.junit.Assert.*;

import com.galvanize.Stack;

public class StackTestCase {

    @Test
    public void testStackPush() {
        Stack newStack = new Stack();
        assertEquals(0, newStack.count());
        newStack.push(100);
        assertEquals(1, newStack.count());
        assertFalse(newStack.empty);
    }

    @Test
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
    public void testStackPeek() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        assertEquals(2, newStack.peek());
    }
}
