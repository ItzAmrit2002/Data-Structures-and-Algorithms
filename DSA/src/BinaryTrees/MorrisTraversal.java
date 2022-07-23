package BinaryTrees;

import java.util.ArrayList;

public class MorrisTraversal {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void morris(BinaryTreeNode<Integer> root)
    {
        BinaryTreeNode<Integer> curr = root;
        while(curr != null)
        {
            if(curr.left == null)
            {
                list.add(curr.data);
                curr = curr.right;
            }
            else
            {
                BinaryTreeNode<Integer> prev = curr.left;
                while(prev.right != null && prev.right != curr)
                {
                    prev = prev.right;
                }
                if(prev.right == null)
                {
                    prev.right = curr;
                    curr = curr.left;
                }
                else {
                    prev.right = null;
                    list.add(root.data);
                    curr = curr.right;
                }
            }
        }
    }
}
