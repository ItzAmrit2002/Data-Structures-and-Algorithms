package BinaryTrees;

public class NodesAtDistKfromNode {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> node, int target, int k) {
        //Your code goes here
        int x = print(node,k,target);
    }

    public static int print(BinaryTreeNode<Integer> root,int k,int elem){
        if(root == null){
            return -1;
        }

        if(root.data == elem){
            printAtDepthK(root,k);
            return 0;
        }

        int ld = print(root.left,k,elem);

        int rd;
        if(ld == -1){
            rd = print(root.right,k,elem);
            if(rd == -1){
                return -1;
            }else if(rd + 1 == k){
                System.out.println(root.data+" ");
                return k;
            }else{
                printAtDepthK(root.left,k-rd-2);
                return rd+1;
            }
        }else if(ld + 1 == k){
            System.out.println(root.data+" ");
            return k;
        }else{
            printAtDepthK(root.right,k-ld-2);
            return ld+1;
        }

    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root,int depth){
        if(root == null){
            return;
        }

        if(depth == 0 && root != null){
            System.out.println(root.data+" ");
            return;
        }

        printAtDepthK(root.left,depth-1);
        printAtDepthK(root.right,depth-1);
    }
}
