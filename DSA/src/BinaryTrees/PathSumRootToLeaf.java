package BinaryTrees;
import java.util.ArrayList;
public class PathSumRootToLeaf {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(root, new ArrayList<Integer>(), ans ,k);
        for(int i=0; i<ans.size(); i+=2)
        {
            for(int j=0; j<ans.get(i).size(); j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, int k)
    {


        if(k==0 && root==null)
        {
            ans.add(new ArrayList<>(ds));
            // System.out.println(ds);
            return;
        }
        if(root==null)
            return;

        ds.add(root.data);
        helper(root.left, ds, ans, k-root.data);
        helper(root.right, ds, ans,k-root.data);
        ds.remove(ds.size()-1);
    }
}
