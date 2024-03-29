import java.util.ArrayList;
import java.util.Collections;

public class MiniMax {

    public int score(Node node) {
        if (node.hasValue()) {
            return node.value();
        } else {
            return maximize(node);
        }
    }

    private int maximize(Node node) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (Node child : node.children) {
            if (child.hasValue()) {
                scores.add(child.value);
            } else {
                return minimize(child);
            }
        }
        return Collections.max(scores);
    }

    private int minimize(Node node) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (Node child : node.children) {
            if (child.hasValue()) {
                scores.add(child.value);
            } else {
                return maximize(child);
            }
        }
        return Collections.min(scores);
    }
}
