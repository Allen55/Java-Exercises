public class LinkedList {
    //head of the list
    Node head;


    static class Node {
        int data;
        Node next;

        //Constructor
        Node(int d){
            this.data = d;
            next = null;
        }

    }

    // This function prints contents of linked list starting from head
    public void printList() {
        Node n = head;
        while ( n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    // method to create a simple linked list with 3 nodes
    public static void main(String[] args) {

        // start with the empty list.
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third;      // Link second node with the third node

        llist.printList();

    }
}
