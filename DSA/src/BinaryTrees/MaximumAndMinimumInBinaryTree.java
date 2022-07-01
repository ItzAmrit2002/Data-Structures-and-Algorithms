package BinaryTrees;


class Pair1<T, U> {
    T minimum;
    U maximum;

    public Pair1(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class MaximumAndMinimumInBinaryTree {
    public static Pair1<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null)
        {
            Pair1<Integer, Integer> p = new Pair1<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
            return p;
        }

        Pair1<Integer, Integer> node1 = getMinAndMax(root.left);
        Pair1<Integer, Integer> node2 = getMinAndMax(root.right);

        int min = Math.min(Math.min(node1.minimum, node2.minimum), root.data);
        int max = Math.max(Math.max(node1.maximum, node2.maximum), root.data);

        Pair1<Integer, Integer> ans = new Pair1(min, max);
        return ans;
    }

}
