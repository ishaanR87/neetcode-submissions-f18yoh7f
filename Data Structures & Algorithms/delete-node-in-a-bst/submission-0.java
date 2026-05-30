/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if (root == null) {
            return null;
        }

        if (key > root.val) {
           root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
           root.left = deleteNode(root.left, key);
        } else {
            root = deleteRoot(root);
        }

        return root;
    }

    private TreeNode deleteRoot(TreeNode node) {

        if (node.left == null) return node.right;
        if (node.right == null) return node.left;

        TreeNode successor = findMin(node.right);
        
        node.val = successor.val;
        node.right = deleteNode(node.right, successor.val);

        return node;

    }

    private TreeNode findMin(TreeNode node) {
        
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}