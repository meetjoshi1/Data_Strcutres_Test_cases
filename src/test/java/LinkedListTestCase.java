import com.galvanize.LinkedList;
import com.galvanize.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTestCase {
    LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    void testListEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void testAddNode() {
        Node node = new Node("Sword");
        linkedList.addNode(node);
        assertEquals(node, linkedList.getHead());
    }

    @Test
    void testAddManyNodesChangesSize() {
        linkedList.addNode(new Node("A"));
        linkedList.addNode(new Node("B"));
        linkedList.addNode(new Node("C"));
        assertEquals(3, linkedList.count());
    }

    @Test
    void testFindNode() {
        Node aNode = new Node("A");
        Node bNode = new Node("B");
        linkedList.addNode(aNode);
        linkedList.addNode(bNode);
        Node result = linkedList.find(aNode);
        assertEquals(aNode, result);
    }

    @Test
    void testRemoveNodeSuccess() {
        Node aNode = new Node("A");
        Node bNode = new Node("B");
        Node cNode = new Node("C");
        Node dNode = new Node("D");
        linkedList.addNode(aNode);
        linkedList.addNode(bNode);
        linkedList.addNode(cNode);
        linkedList.addNode(dNode);
        linkedList.removeNode(cNode);
        assertEquals(3, linkedList.count());
        assertEquals(bNode.getNext(), dNode);
    }
}
