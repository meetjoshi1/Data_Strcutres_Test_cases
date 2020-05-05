import org.junit.Test;
import static org.junit.Assert.*;

import com.galvanize.Stack;

public class StackTestCase {

    @Test
    public void test_stack_push() {
        Stack newStack = new Stack();
        newStack.push(100);
        assertFalse(newStack.empty);
    }

    @Test
}
