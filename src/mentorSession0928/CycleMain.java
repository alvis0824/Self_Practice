package mentorSession0928;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CycleMain {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(2);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;

        List<String> names = new ArrayList<>(Arrays.asList("zero","first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"));

        System.out.println(names.get(detectCycle(node1).val) + " node");
    }

    private static ListNode detectCycle(ListNode head) {

        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        int index = 0;
        while(current!=null){
            index++;
            if(visited.contains(current)){
                current.val = index-1;
                return current;
            }
            visited.add(current);
            current = current.next;
        }

        return null;
    }
}
