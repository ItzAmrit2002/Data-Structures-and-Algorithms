package BinaryTrees;
import java.util.*;

public class PrintTreeLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);

        while(!q.isEmpty())
        {
            BinaryTreeNode<Integer> node = q.poll();
            System.out.print(node.data+":");

            if(node.left != null)
            {
                q.add(node.left);
                System.out.print("L:"+node.left.data+",");
            }
            else
            {
                System.out.print("L:-1,");
            }

            if(node.right != null)
            {
                q.add(node.right);
                System.out.print("R:"+node.right.data);
                System.out.println();
            }
            else
            {
                System.out.print("R:" + "-1");
                System.out.println();
            }

        }
    }
}
