package Trees;

public class ReplaceNodeWithDepth {

    public static void replaceWithDepthValue(TreeNode<Integer> root){

// Write your code here
        helper(root, 0);

    }
    static void helper(TreeNode<Integer> root, int depth)
    {
        // Replace the node data with
        // it's depth
        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), depth + 1);
        }
    }
}
