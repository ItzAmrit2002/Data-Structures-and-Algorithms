package Trees;

public class StructurallyIdentical {

    static boolean ans = true;
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        // Write your code here
        if(root1.data == root2.data)
        {

            if(root1.children.size() != root2.children.size())
            {
                ans = false;
            }
            else
            {
                for(int i=0; i<root1.children.size(); i++)
                {
                    checkIdentical(root1.children.get(i), root2.children.get(i));
                }
            }

        }
        else
        {
            ans = false;
        }
        return ans;
    }
}
