package BinaryTrees;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TimeToBurnATree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int minTime(Node root, int target)
    {
        // Your code goes here
        HashMap<Node, Node> map = new HashMap<>();
        Node targetNode = addParents(map, root, target);
        return findTime(map, targetNode);
    }
    public static int findTime(HashMap<Node, Node> map, Node target)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(target);
        HashMap<Node, Integer> vis = new HashMap<>();
        vis.put(target, 1);
        int maxi = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            int fl = 0;

            for(int i=0; i<size; i++)
            {
                Node node = q.poll();
                if(node.left != null && vis.get(node.left)==null)
                {
                    fl = 1;
                    vis.put(node.left, 1);
                    q.add(node.left);
                }
                if(node.right != null && vis.get(node.right)==null)
                {
                    fl = 1;
                    vis.put(node.right, 1);
                    q.add(node.right    );
                }
                if(map.get(node) != null && vis.get(map.get(node)) == null)
                {
                    fl = 1;
                    vis.put(map.get(node), 1);
                    q.add(map.get(node));
                }
            }
            if(fl == 1)
                maxi++;
        }
        return maxi;
    }
    public static Node addParents(HashMap<Node, Node> map, Node root, int target)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node res = null;
        while(!q.isEmpty())
        {
            Node node = q.poll();
            if(node.data == target)
                res = node;

            if(node.left!=null)
            {
                map.put(node.left, node);
                q.add(node.left);
            }

            if(node.right != null)
            {
                map.put(node.right, node);
                q.add(node.right);
            }
        }
        return res;
    }
}
