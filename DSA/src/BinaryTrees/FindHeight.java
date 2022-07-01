package BinaryTrees;

public class FindHeight {
    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right)+1;
    }
}
