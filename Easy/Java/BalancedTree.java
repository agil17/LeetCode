import java.util.LinkedList;
import java.util.Queue;

public class BalancedTree {
    public static Node balanced(int[] arr, int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = (left + right)/2;

        Node head = new Node(arr[mid]);
        // Node current = head;
        head.left = balanced(arr, left, mid - 1);
        head.right = balanced(arr, mid + 1, right);

        return head;
    }

    public static void printPreOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.printf("%d ", root.val);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printLevelOrder(Node root) {
        Queue<Node> levelNodes = new LinkedList<>();
        levelNodes.add(root);

        while(!levelNodes.isEmpty()) {
            int size = levelNodes.size();

            for(int i = 0; i < size; i++) {
                Node current = levelNodes.poll();

                System.out.printf("%d ", current.val);

                if(current.left != null) {
                    levelNodes.add(current.left);
                }
                if(current.right != null) {
                    levelNodes.add(current.right);
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int[] arr = populate(10);
        Node root = balanced(arr, 0, arr.length - 1);

        // printLevelOrder(root);
        System.out.println(5.0/2.0);

        
    }

    public static int[] populate(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
