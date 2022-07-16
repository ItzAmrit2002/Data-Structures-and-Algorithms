package BinarySearchTrees;

import java.util.Stack;

class BSTIterator {

        public static Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {

            pushAll(root);
        }

        public int next() {
            TreeNode temp = stack.pop();
            pushAll(temp.right);
            return temp.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;

            }
        }
    }

