package BinaryTrees;

import java.util.ArrayList;

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}

public class RemoveLeafNodes {
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root==null){ return null;}// if root is null return null
        if(root.children.size()==0){// if root itself is leaf return null
            return null;
        }
        // if root.children is a leaf node
        // then delete it from children vector
        for (int i = 0; i < root.children.size(); i++) {

            TreeNode<Integer> child= root.children.get(i);
            if (child.children.size() == 0) {

                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++)
                    root.children.set(j, root.children.get(j + 1));

                // delete the last element
                root.children.remove(root.children.size()-1);

                i--;
            }
        }

        // Remove all leaf node
        // of children of root
        for (int i = 0;
             i < root.children.size();
             i++) {

            // call function for root.children
            root.children.set(i,removeLeafNodes(root.children.get(i)));
        }
        return root;

    }
}
