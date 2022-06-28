package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {


    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        nodes.add(root);
        nodes.add(nullNode);
        System.out.print(root.data);
        System.out.println();

        while(nodes.size()!=1)
        {
            TreeNode<Integer> node = nodes.poll();
            if(node == nullNode)
            {
                nodes.add(nullNode);
                System.out.println();
                continue;
            }
            for(int i=0; i<node.children.size(); i++)
            {
                System.out.print(node.children.get(i).data+" ");
                nodes.add(node.children.get(i));
            }
        }

    }
}
