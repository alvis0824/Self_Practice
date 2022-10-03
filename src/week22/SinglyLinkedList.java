package week22;

public class SinglyLinkedList {

    Node head;
    Node prev;

    public Node add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return head;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeDuplicate(Node head) {
        Node current = head.next;
        prev = head;
        while(current != null){
            if(current.value == prev.value){
                current = current.next;
                prev.next = current;
            }else {
                prev = current;
                current = current.next;
            }
        }
    }
}
