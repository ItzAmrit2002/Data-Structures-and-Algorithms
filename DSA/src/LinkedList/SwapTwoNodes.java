package LinkedList;

public class SwapTwoNodes {

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp2 = head;

        for(int x=0; x<i; x++)
        {
            temp = temp.next;
        }

        for(int y = 0; y<j; y++)
        {
            temp2 = temp2.next;
        }

        int t = temp.data;
        temp.data = temp2.data;
        temp2.data = t;

        return head;

    }

}
