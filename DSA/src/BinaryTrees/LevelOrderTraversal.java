package BinaryTrees;
import java.util.*;
public class LevelOrderTraversal {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int len = q.size();
            for(int i=0;i<len;i++){
                root = q.poll();
                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
                System.out.print(root.data+" ");
            }
            System.out.println();
        }

    }
}
