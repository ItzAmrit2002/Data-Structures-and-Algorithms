package BinaryTrees;

public class ConstructTreeFromPostAndIn {
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        return getTreeFromPostAndIn(postOrder, inOrder, 0, postOrder.length-1 ,0 , inOrder.length-1);
    }
    public static BinaryTreeNode<Integer> getTreeFromPostAndIn(int[] post,
                                                               int[] in,int postS,int postE,int inS,int inE){
        if(inS>inE){
            return null;
        }
        int rootData = post[postE];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int i = inS;
        while(i<=inE){
            if(in[i]== rootData){
                break;
            }
            i++;
        }
        int leftInStart = inS;
        int leftInEnd = i-1;
        int rightInStart = i+1;
        int rightInEnd = inE;

        int leftPostStart = postS;
        int rightPostEnd= postE-1;
        int leftLength = leftInEnd-leftInStart+1;
        int leftPostEnd = leftPostStart+leftLength-1;
        int rightPostStart= leftPostEnd+1;


        root.left = getTreeFromPostAndIn(post,in,leftPostStart,leftPostEnd,leftInStart,leftInEnd);
        root.right = getTreeFromPostAndIn(post,in,rightPostStart,rightPostEnd,rightInStart,rightInEnd);
        return root;
    }
}
