package week22;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);

        list.printList();
        list.removeDuplicate(list.head);
        list.printList();
    }
}
