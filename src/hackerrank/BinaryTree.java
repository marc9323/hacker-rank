package hackerrank;

public class BinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.right = new TreeNode("B");
        root.left = new TreeNode("C");

        preOrder(root);
    }

    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }
    }

    static TreeNode root;

    /**
     * Java method to print tree nodes in PreOrder traversal
     */
    public static void preOrder() {
        preOrder(root);
    }

    /**
     * Traverse the binary tree
     * in PreOrder
     *    * @param node - starting node, root
     */

    private static void preOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        System.out.printf("%s ", node.data);

        preOrder(node.left);
        preOrder(node.right);
        
    }
}
