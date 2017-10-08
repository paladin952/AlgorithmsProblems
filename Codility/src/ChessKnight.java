import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * A knight on an infinity chess board. Find the shortest path to destination
 */
public class ChessKnight {

    public static void main(String[] args) {
        assert BFS(new Node(0, 7), new Node(7, 0)) == 6;
        assert BFS(new Node(0, 0), new Node(4, 5)) == 3;
    }

    private static int row[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int col[] = {1, 2, 2, 1, -1, -2, -2, -1};

    private static int BFS(Node src, Node dest) {
        Map<Node, Boolean> visitedNodes = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.x == dest.x && node.y == dest.y) {
                if (node.dist > 100) {
                    return -2;
                }
                return node.dist;
            }

            if (!visitedNodes.containsKey(node)) {
                visitedNodes.put(node, true);
                for (int i = 0; i < row.length; i++) {
                    queue.add(new Node(node.x + row[i], node.y + col[i], node.dist + 1));
                }
            }
        }
        return -1;
    }

    private static class Node {
        private int x;
        private int y;
        private int dist;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

}

