package LinkedList;

public class ReverseLinkedListRec {
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null)
            return head;

        LinkedListNode<Integer> finalHead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = head;
        head.next = null;

        return finalHead;
    }

    public static LinkedListNode<Integer> reverseLLRec(LinkedListNode<Integer> head)
    {
        if(head == null)
            return head;

        LinkedListNode<Integer> newHead = reverseLLRec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


}
