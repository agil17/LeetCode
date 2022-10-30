import java.util.ArrayList;
import java.util.List;

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

    public void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.value);
        inOrder(root.right, list);
        
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(15);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(22);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(12);
        tree.root.right.left = new TreeNode(18);
        tree.root.right.right = new TreeNode(24);

        List<Integer> list = tree.inOrderTraversal(tree.root);
        for(Integer i : list) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}

