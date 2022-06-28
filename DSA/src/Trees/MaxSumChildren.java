package Trees;

public class MaxSumChildren {
    /*
    Given a tree, find and return the node for which sum of data of all children and the node itself
    is maximum. In the sum, data of node itself and data of immediate children is to be taken
     */
    static int max = 0;
    static TreeNode<Integer> temp = null;
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here


        int sum = root.data;

        for(int i=0; i<root.children.size(); i++)
        {
            sum+=root.children.get(i).data;
            maxSumNode(root.children.get(i));
        }
        if(sum > max)
        {
            max = sum;
            temp = root;
        }
        return temp;


    }
}
