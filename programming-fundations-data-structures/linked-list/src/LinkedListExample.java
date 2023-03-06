//Linked List
public class LinkedListExample {
    Node head;
    Node tail;

    public void add(int data) {
//        LL is empty
        if(this.head == null) {
            this.head = new Node(data);
        } else {
//            LL is not empty
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }

    public static void main(String[] args) {
        LinkedListExample myList = new LinkedListExample();
        myList.add(10);
        myList.add(18);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
    }
}

//Node
class Node {
    int data;
    Node next;
    Node previous;
    Node(int d) {this.data = d;}
}
