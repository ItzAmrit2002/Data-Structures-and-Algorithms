package Trees;

public class SecondLargest {

    public static TreeNode<Integer> largest;
    public static TreeNode<Integer> secondLargest;
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


        // Write your code here
        largest = new TreeNode<Integer>( Integer.MIN_VALUE);
        secondLargest = largest;

        findSecondLargestHelper(root);
        return secondLargest;

    }
    public static void findSecondLargestHelper(TreeNode<Integer> root)
    {

        // Base Case
        if (root == null) {
            return;
        }

        // Check if root's data is larger than current largest node's data
        if (root.data > largest.data) {
            secondLargest = largest;
            largest = root;
        } else if (root.data > secondLargest.data && root.data != largest.data)
            secondLargest = root;

        // recursively find second largest in children
        // for (Node child: root.children)
        //     findSecondLargestHelper(child);

        for(int i=0; i<root.children.size(); i++)
        {
            findSecondLargestHelper(root.children.get(i));
        }
    }
}
