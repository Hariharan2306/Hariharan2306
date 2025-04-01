package BinaryTree;

public class Traversal {
    public static void main(String[] args) {
        // initialization
        TreeNode node = new TreeNode('A');

        node.left = new TreeNode('B');
        node.right = new TreeNode('C');

        node.left.left = new TreeNode('D');
        node.left.right = new TreeNode('E');

        node.right.left = new TreeNode('F');
        node.right.right = new TreeNode('G');

        System.out.println("---- Here Starts Preorder traversal ----");
        PreOrder(node);
        System.out.println("\n---- Here Starts Postorder traversal ----");
        PostOrder(node);
    }

    private static void PreOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    private static void PostOrder(TreeNode node) {
        if (node == null)
            return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value + " ");
    }
}

// time - o(N)
// space - o(log N) - o(N)

// use case

// preorder - Cloning
// postorder - Deleting
