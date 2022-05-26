package LinkedList;

public class CheckPalindrome {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode mid = middleNode(head);
        LinkedListNode headSecond = reverseList(mid);
        LinkedListNode rereverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.data != headSecond.data) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }
    public static LinkedListNode reverseList(LinkedListNode head) {
        if (head == null) {
            return head;
        }
        LinkedListNode prev = null;
        LinkedListNode present = head;
        LinkedListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    public static LinkedListNode middleNode(LinkedListNode head) {
        LinkedListNode s = head;
        LinkedListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


}
