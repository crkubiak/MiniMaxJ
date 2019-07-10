import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void createsANodeWithNoValue() {
        Node node = new Node();

        assertEquals(false, node.hasValue());
    }

    @Test
    public void createsANodeWithNoChildren() {
        Node node = new Node();

        assertEquals(true, node.children().isEmpty());
    }

    @Test
    public void createsANodeWithAValue() {
        Node node = new Node(5);

        assertEquals(true, node.hasValue());
        assertEquals(5, node.value());
    }

    @Test
    public void createsANodeWithOneChildandValue() {
        Node child = new Node(20);
        ArrayList<Node> children = new ArrayList<>();
        children.add(child);
        Node parent = new Node(40, children);
        assertEquals(true, parent.children().contains(child));
    }

    @Test
    public void createsANodeWithOneChildAndNoValue() {
        Node child = new Node(20);
        ArrayList<Node> children = new ArrayList<>();
        children.add(child);
        Node parent = new Node(children);
        assertEquals(true, parent.children().contains(child));
    }

    @Test
    public void createsANodeWithThreeChildrenAndValue() {
        Node child1 = new Node(20);
        Node child2 = new Node(30);
        Node child3 = new Node(40);
        ArrayList<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Node parent = new Node(40, children);
        assertEquals(children, parent.children());
    }

    @Test
    public void createsALinkedList() {
        Node child = new Node(10);
        ArrayList<Node> childToParent = new ArrayList<>();
        childToParent.add(child);
        Node parent = new Node(20, childToParent);
        ArrayList<Node> parentToGrandParent = new ArrayList<>();
        parentToGrandParent.add(parent);
        Node grandParent = new Node(30, parentToGrandParent);

        assertEquals(childToParent, parent.children());
        assertEquals(parentToGrandParent, grandParent.children());
    }
}