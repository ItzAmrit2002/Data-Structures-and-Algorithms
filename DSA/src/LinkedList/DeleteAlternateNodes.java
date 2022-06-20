package LinkedList;

public class DeleteAlternateNodes {

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        while(head.next!=null){
            if(head.next.next!=null){
                head.next=head.next.next;
                head=head.next;
            }else{
                head.next=null;
            }
        }
    }
}
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
