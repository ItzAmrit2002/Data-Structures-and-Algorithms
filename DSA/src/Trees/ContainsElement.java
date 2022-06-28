package Trees;

public class ContainsElement {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // Write your code here

        if(root.data == x)
            return true;
        boolean check = false;
        for(int i=0; i<root.children.size(); i++)
        {
            check = check || checkIfContainsX(root.children.get(i), x);
        }
        return check;

    }
}
