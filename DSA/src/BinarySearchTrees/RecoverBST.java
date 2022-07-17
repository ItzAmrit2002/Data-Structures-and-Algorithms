package BinarySearchTrees;

public class RecoverBST {
    TreeNode previous;
    TreeNode first;
    TreeNode middle;
    TreeNode last;

    public void recoverTree(TreeNode root) {

        previous = new TreeNode(Integer.MIN_VALUE);

        inOrder(root);

        if (first != null && last != null) {

            int temp = first.val;
            first.val = last.val;
            last.val = temp;

        } else if (first !=null && middle != null) {

            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    private void inOrder(TreeNode current) {

        if (current == null) {

            return;
        }

        inOrder(current.left);

        if (previous !=null && (current.val < previous.val)) {

            if (first == null) {

                first = previous;
                middle = current;

            } else {

                last = current;
            }
        }

        previous = current;
        inOrder(current.right);
    }
}
