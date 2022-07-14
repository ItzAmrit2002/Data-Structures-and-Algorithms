package BinarySearchTrees;

public class CreateAndInsertDuplicateNode {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null)
            return;

        BinaryTreeNode<Integer> node = new BinaryTreeNode(root.data);
        node.left = root.left;
        root.left = node;

        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
    }
}
