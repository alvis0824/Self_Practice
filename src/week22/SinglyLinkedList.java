package week22;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {

    Node head;
    Node prev;
    public List<Integer> removeDuplicate(List<Integer> list) {
        head = prev = new Node(list.get(0));
        Node current = head;

        for (int i = 1; i < list.size(); i++) {
            current.next = new Node(list.get(i));
            prev = current;
            current = current.next;
            if(current.value == prev.value){
                list.set(i,-1);
                continue;
            }else {
                prev.next = current;
            }
        }
        list.removeIf(i -> i == -1);
        return list;
    }


    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 1, 3, 4, 4, 4, 5, 6, 6));
        System.out.println(list);
        System.out.println(linkedList.removeDuplicate(list));
    }


}
