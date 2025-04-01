package BinaryTree;

public class TreeNode {
    char value;
    TreeNode left, right;

    TreeNode(char value) {
        this.value = value;
        left = right = null;
    }

}

// Pseudocode

// 1, Initialize a Binary Tree Class

// class TreeNode {
// int value;
// TreeNode left, right;

// Constructor TreeNode(val):
// value = val
// left = right = NULL
// }

// 2, insert node into binary tree

// node = new TreeNode(value);
// node.left = new TreeNode(newLeftValue);
// node.right = new TreeNode(newRightValue);

// 3, Preorder Traversal (Root → Left → Right)

// Method preorder(node):
// If node is NOT NULL:
// Print node.value
// preorder(node.left)
// preorder(node.right)

// 4, Postorder Traversal (Left → Right → Root)

// Method postorder(node):
// If node is NOT NULL:
// postorder(node.left)
// postorder(node.right)
// Print node.value
