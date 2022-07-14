package BinaryTrees;

public class LCAOfBinaryTree {
    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(root == null)
            return -1;

        if(root.data == a || root.data == b)
        {
            return root.data;
        }

        int left = getLCA(root.left, a, b);
        int right = getLCA(root.right, a, b);

        if(left != -1  && right == -1)
        {
            return left;
        }
        else if(left == -1 && right != -1)
        {
            return right;
        }
        else if(left == -1 && right == -1)
        {
            return -1;
        }
        else
        {
            return root.data;
        }
    }
}
