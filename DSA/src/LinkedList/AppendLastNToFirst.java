package LinkedList;

public class AppendLastNToFirst {
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {

        if(head == null || head.next == null)
            return head;
        if(n==0)
            return head;
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        temp = head;
        for(int i=1; i<count-n; i++)
        {
            temp = temp.next;
        }

        LinkedListNode<Integer> newHead;
        newHead = temp.next;
        temp.next = null;

        temp = newHead;

        while(temp.next != null)
        {
            temp = temp.next;

        }
        temp.next = head;

        return newHead;
    }
}
