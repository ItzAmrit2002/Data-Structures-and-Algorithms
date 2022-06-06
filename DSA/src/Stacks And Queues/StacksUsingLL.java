package Stacks;

//Elements are added at the beginning of the stack

public class StacksUsingLL {

    //Define the data members
    private Node head;
    private int size;



    public StacksUsingLL() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        size++;

    }

    public int pop() {
        //Implement the pop() function
        if(!isEmpty()){
            int t = head.data;
            head = head.next;
            size--;
            return t;

        }
        return -1;
    }

    public int top() {
        //Implement the top() function
        if(isEmpty())
            return -1;
        return head.data;

    }
}

