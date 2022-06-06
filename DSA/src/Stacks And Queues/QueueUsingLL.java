package Stacks;

//Elements are added to the end of the stack

public class QueueUsingLL {

    //Define the data members
    Node f;
    Node r;
    int size;

    public QueueUsingLL() {
        //Implement the Constructor
        f = null;
        r = null;
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


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node n = new Node(data);

        if(isEmpty())
        {
            f = n;
            r = n;
            size++;
        }
        else
        {
            r.next = n;
            r = n;
            size++;
        }


    }


    public int dequeue() {
        //Implement the dequeue() function
        if(isEmpty())
            return -1;

        int temp = f.data;
        f = f.next;
        size--;
        return temp;
    }


    public int front() {
        //Implement the front() function
        if(isEmpty() || f == null)
            return -1;

        return f.data;
    }
}
