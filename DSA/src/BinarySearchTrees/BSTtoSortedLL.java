package BinarySearchTrees;
class LinkedListNode<T> { T data; LinkedListNode<T> next;

              public LinkedListNode(T data) { this.data = data; } }

public class BSTtoSortedLL {
    public static int counter = 0;
    public static LinkedListNode<Integer> head;
    public static LinkedListNode<Integer> temp;
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return null;
        }
        LinkedListNode<Integer> newNode = new LinkedListNode(root.data);
        constructLinkedList(root.left);
        if (counter == 1) {
            temp.next = newNode;
            temp = temp.next;
        }
        if (head == null) {
            counter++;
            if (counter == 1) {
                head = newNode;
                temp = head;
            }
        }
        constructLinkedList(root.right);
        return head;
    }
}
