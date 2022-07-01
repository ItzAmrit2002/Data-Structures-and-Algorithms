package BinaryTrees;

public class ConstructTreeFromPreAndIn {
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return getTreeFromPreorderAndInorder(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
    }
    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in, int startIndexPre,
                                                                        int endIndexPre, int startIndexIn, int endIndexIn) {
        if (startIndexPre > endIndexPre || startIndexIn > endIndexIn) {
            return null;
        }
        int temp = pre[startIndexPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);

        int i = 0;
        for (int j = 0; j < in.length; j++) {
            if (temp == in[j]) {
                i = j;
                break;
            }
        }
        root.left = getTreeFromPreorderAndInorder(pre, in, startIndexPre + 1, startIndexPre + (i - startIndexIn), startIndexIn, i - 1);
        root.right = getTreeFromPreorderAndInorder(pre, in, startIndexPre + (i - startIndexIn) + 1, endIndexPre, i + 1, endIndexIn);
        return root;
    }
}
