package BinaryTrees;

public class CheckCousins {
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        // Write your code here
        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);
    }
    public static boolean isSiblings(BinaryTreeNode<Integer> root, int p, int q)
    {
        if(root == null)
            return false;

        if(root.left != null && root.right != null)
        {
            if(root.left.data == p && root.right.data == q)
            {
                return true;
            }
        }
        return isSiblings(root.left, p, q) || isSiblings(root.right, p, q);
    }
    public static int level(BinaryTreeNode<Integer> root, int k, int n)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.data == n)
        {
            return k;
        }
        int left = level(root.left, k+1, n);
        int right = level(root.right, k+1, n);
        if(left != -1)
        {
            return left;
        }
        if(right != -1)
        {
            return right;
        }
        return -1;
    }
}
