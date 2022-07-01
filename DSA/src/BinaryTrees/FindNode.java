package BinaryTrees;

public class FindNode {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root == null)
            return false;
        if(root.data == x)
            return true;

        return isNodePresent(root.left, x) || isNodePresent(root.right, x);
    }
}
