package BinaryTrees;

class Pair{
    int height;
    int diameter;
    public Pair(int height, int diameter)
    {
        this.height = height;
        this.diameter = diameter;
    }
}
public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        Pair ans = helper(root);
        return ans.diameter;
    }
    public static Pair helper(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            Pair p = new Pair(0, 0);
            return p;
        }
        Pair node1 = helper(root.left);
        Pair node2 = helper(root.right);


        int ht = Math.max(node1.height, node2.height)+1;
        int diam = node1.height + node2.height+1;

        int fdiam = Math.max(diam, Math.max(node1.diameter, node2.diameter));

        Pair p = new Pair(ht, fdiam);
        return p;
    }
}
