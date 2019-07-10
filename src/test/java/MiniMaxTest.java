import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MiniMaxTest {
    @Test
    public void miniMaxReturnsScoreOfANodeWithNoChild() {
        Node node = new Node(5);
        MiniMax mm = new MiniMax();

        int score = mm.score(node);

        assertEquals(5, score);
    }

    @Test
    public void miniMaxReturnsScoreOfANodeWithOneChild() {
        Node child = new Node(10);
        ArrayList<Node> childToParent = new ArrayList<>();
        childToParent.add(child);
        Node parent = new Node(childToParent);
        MiniMax mm = new MiniMax();

        int score = mm.score(parent);

        assertEquals(10, score);
    }

    @Test
    public void miniMaxReturnsScoreOfLinkedList() {
        Node child = new Node(10);
        ArrayList<Node> childToParent = new ArrayList<>();
        childToParent.add(child);
        Node parent = new Node(childToParent);
        ArrayList<Node> parentToGrandParent = new ArrayList<>();
        parentToGrandParent.add(parent);
        Node grandParent = new Node(parentToGrandParent);

        MiniMax mm = new MiniMax();
        mm.score(grandParent);
    }

    @Test
    public void miniMaxReturnsLargestOfTwoChildren() {
        Node child1 = new Node(10);
        Node child2 = new Node(20);
        ArrayList<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        Node parent = new Node(children);

        MiniMax mm = new MiniMax();
        int score = mm.score(parent);

        assertEquals(20, score);
    }

    @Test
    public void miniMaxReturnsSmallestGrandChild() {
        Node child1 = new Node(10);
        Node child2 = new Node(20);
        ArrayList<Node> childToParent = new ArrayList<>();
        childToParent.add(child1);
        childToParent.add(child2);
        Node parent = new Node(childToParent);
        ArrayList<Node> parentToGrandParent = new ArrayList<>();
        parentToGrandParent.add(parent);
        Node grandParent = new Node(parentToGrandParent);

        MiniMax mm = new MiniMax();
        int score = mm.score(grandParent);

        assertEquals(10, score);
    }

    @Test
    public void miniMaxReturnsTheValue() {
        Node child1 = new Node(1);
        Node child2 = new Node(0);
        Node child3 = new Node(2);
        Node child4 = new Node(-5);
        ArrayList<Node> childToParent1 = new ArrayList<>();
        childToParent1.add(child1);
        childToParent1.add(child2);
        ArrayList<Node> childToParent2 = new ArrayList<>();
        childToParent1.add(child3);
        childToParent1.add(child4);
        Node parent1 = new Node(childToParent1);
        Node parent2 = new Node(childToParent2);
        ArrayList<Node> parentToGrandParent1 = new ArrayList<>();
        parentToGrandParent1.add(parent1);
        ArrayList<Node> parentToGrandParent2 = new ArrayList<>();
        parentToGrandParent2.add(parent2);
        Node grandParent1 = new Node(parentToGrandParent1);
        Node grandParent2 = new Node(parentToGrandParent2);
        ArrayList<Node> grandParentToGreatGrandParent = new ArrayList<>();
        grandParentToGreatGrandParent.add(grandParent1);
        grandParentToGreatGrandParent.add(grandParent2);
        Node greatGrandParent = new Node(grandParentToGreatGrandParent);
        ArrayList<Node> ggp2gggp = new ArrayList<>();
        ggp2gggp.add(greatGrandParent);
        Node greatGreatGrandParent = new Node(ggp2gggp);


        MiniMax mm = new MiniMax();
        int score = mm.score(greatGreatGrandParent);
        assertEquals(-5, score);

    }
}