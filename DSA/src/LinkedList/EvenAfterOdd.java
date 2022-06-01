package LinkedList;

public class EvenAfterOdd {

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        //Your code goes here

        if(head == null)
            return head;
        LinkedListNode<Integer> OddH = null, OddT = null, EvenH = null, EvenT = null;

        LinkedListNode<Integer> temp = head;

        while(temp != null)
        {
            if(temp.data % 2 != 0)
            {
                if(OddH == null)
                {
                    OddH = temp;
                    OddT = temp;
                }
                else
                {
                    OddT.next = temp;
                    OddT = OddT.next;
                }
            }
            else
            {
                if(EvenH == null)
                {
                    EvenH = temp;
                    EvenT = temp;
                }
                else
                {
                    EvenT.next = temp;
                    EvenT = EvenT.next;
                }
            }

            temp = temp.next;


        }
        if(EvenH == null)
        {
            OddT.next = null;
            return OddH;
        }
        EvenT.next = null;
        if(OddH == null)
            return EvenH;
        OddT.next = EvenH;

        return OddH;
    }
}
