package Trees;

public class NextLargerElement {
    /*
    Given a generic tree and an integer n. Find and return the node with next larger element in the
     Tree i.e. find a node with value just greater than n
     */

    static TreeNode<Integer> ans = null;
    static int min = 0;
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here
        if ( root.data > n && min == 0)
        {
            ans = root;
            min = root.data;

        }
        else if(root.data > n && root.data < min)
        {
            ans = root;
            min = root.data;
        }

        for(int i=0; i<root.children.size(); i++)
        {
            findNextLargerNode(root.children.get(i), n);
        }

        return ans;


    }
}
