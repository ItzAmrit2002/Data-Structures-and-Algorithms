package LinkedList;

public class kReverse {

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(head== null || head.next==null){
            return null;
        } //base case
        if(k==0 || k==1)
            return head;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;
        int count = 0;
        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = kReverse(next, k);
        }
        return prev;
    }
}
