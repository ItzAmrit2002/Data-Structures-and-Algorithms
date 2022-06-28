package Trees;

public class CountLeafNodes {

    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root.children.size() < 1)
            return 1;

        int ans = 0;

        for(int i=0; i<root.children.size(); i++)
        {
            ans+=countLeafNodes(root.children.get(i));
        }
        return ans;
    }
}
