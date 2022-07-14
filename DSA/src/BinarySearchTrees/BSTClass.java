package BinarySearchTrees;
import java.util.ArrayList;
public class BSTClass {
    private BinaryTreeNode<Integer> root;
    public void insert(int data) {
        //Implement the insert() function
        root = insert(data, root);
    }
    public BinaryTreeNode<Integer> insert(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
        }

        if(root.data >= data)
        {
            root.left = insert(data, root.left);
        }
        else
        {
            root.right = insert(data, root.right);
        }
        return root;
    }

    public void remove(int data) {
        //Implement the remove() function
        root = remove(data, root);
    }

    public BinaryTreeNode<Integer> remove(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }

        if(data < root.data)
        {
            root.left = remove(data, root.left);
            return root;
        }
        else if(data > root.data)
        {
            root.right = remove(data, root.right);
            return root;
        }
        else
        {
            if(root.left == null && root.right == null)
            {
                return null;
            }
            else if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else
            {
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left != null)
                {
                    minNode= minNode.left;
                }
                root.data = minNode.data;
                root.right = remove(minNode.data, root.right);
                return root;
            }
        }
    }

    public void printTree() {
        //Implement the printTree() function
        printTree(root);
    }

    public void printTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return;
        System.out.print(root.data + ":");
        if(root.left != null)
        {
            System.out.print("L:"+root.left.data+",");

        }
        if(root.right != null)
        {
            System.out.print("R:"+ root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }

    public boolean search(int data) {
        //Implement the search() function
        return search(data, root);
    }
    public boolean search(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return false;
        if(root.data == data)
            return true;
        else if(data > root.data)
        {
            return search(data, root.right);
        }
        else
        {
            return search(data, root.left);
        }
    }
}
