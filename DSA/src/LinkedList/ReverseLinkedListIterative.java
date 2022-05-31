package LinkedList;

public class ReverseLinkedListIterative {

    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(head == null || head.next == null)
            return head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> present = head;
        LinkedListNode<Integer> next = head.next;

        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null)
            {
                next = next.next;
            }
        }

        head = prev;
        return head;
    }
}
