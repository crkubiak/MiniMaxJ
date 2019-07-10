import java.util.ArrayList;

public class Node {
    ArrayList<Node> children;
    int value;
    boolean hasValue;

    public Node() {
        children = new ArrayList<>();
        hasValue = false;
        value = 0;
    }

    public Node(ArrayList<Node> children) {
        hasValue = false;
        value = 0;
        this.children = children;
    }

    public Node(int value) {
        hasValue = true;
        this.value = value;
        children = new ArrayList<>();
    }

    public Node(int value, ArrayList<Node> children) {
        hasValue = true;
        this.value = value;
        this.children = children;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public ArrayList<Node> children() {
        return children;

    }

    public int value() {
        return value;
    }
}
