import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(){
        this.left = null;
        this.right = null;
    }

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list);
        return list;
    }

    public void levelOrder(TreeNode root, List<List<Integer>> list) {
        Queue<TreeNode> levelNodes = new LinkedList<>();
        levelNodes.add(root);
        
        while(!levelNodes.isEmpty()) {
            List<Integer> innerList = new ArrayList<>();
            int size = levelNodes.size();

            for(int i = 0; i < size; i++) {
                TreeNode current = levelNodes.poll();

                innerList.add(current.value);

                if(current.left != null) {
                    levelNodes.add(current.left);
                }
                if(current.right != null) {
                    levelNodes.add(current.right);       
                }
            }
            list.add(innerList);
        }

    }

    public void printLevels(List<List<Integer>> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                System.out.printf("%d ", list.get(i).get(j));
            }
            System.out.println();
        }
    }

    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int minDepth = 0;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if(current.left == null && current.right == null) {
                    return minDepth + 1;
                }
                if(current.left != null) {
                    q.add(current.left);
                }
                if(current.right != null) {
                    q.add(current.right);
                }
            }
            minDepth++;
        }
        return minDepth;

    }

    public void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.value);
        inOrder(root.right, list);
        
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(left > right) {
            return left + 1;
        }
        else {
            return right + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(15);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(22);
        // tree.root.left.left = new TreeNode(4);
        // tree.root.left.right = new TreeNode(12);
        // tree.root.right.left = new TreeNode(18);
        tree.root.right.right = new TreeNode(24);
        tree.root.right.right.right = new TreeNode(14);

        System.out.println(tree.isBalanced(tree.root));
        
        
    }
}

