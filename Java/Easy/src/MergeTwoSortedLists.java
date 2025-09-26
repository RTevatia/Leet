import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public List<Integer> listMerge(List<Integer> list1, List<Integer> list2) {
        if (list1.isEmpty() && list2.isEmpty()) return new ArrayList<>();
        if (list1.isEmpty()) return new ArrayList<>(list2);
        if (list2.isEmpty()) return new ArrayList<>(list1);

        List<Integer> merged = new ArrayList<>();

        int i = 0, j = 0;

        while ( i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j))
                merged.add(list1.get(i++));
            else 
                merged.add(list2.get(j++));
        }

        while (i < list1.size())
            merged.add(list1.get(i++));
        
        while (j < list2.size())
            merged.add(list2.get(j++));

        return merged;
    }

    public Node linkedListMerge(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node dummy = new Node(0);
        Node current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public Node convertListToLinkedList(List<Integer> inputList) {
        if (inputList.isEmpty()) return null;

        Node head = new Node(inputList.get(0));
        Node current = head;

        for (int i = 1; i < inputList.size(); i++) {
            current.next = new Node(inputList.get(i));
            current = current.next;
        }

        return head;
    }

    public List<Integer> convertLinkedListToList(Node head) {
        List<Integer> result = new ArrayList<>();
        Node current = head;

        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        return result;
    }

    public static void main() {
        MergeTwoSortedLists ml = new MergeTwoSortedLists();
        
        System.err.println("Merge using list method");
        System.err.println("Example 1: " + ml.listMerge(Arrays.asList(1,2,3), Arrays.asList(1,3,4)));
        System.err.println("Example 2: " + ml.listMerge(Arrays.asList(), Arrays.asList()));
        System.err.println("Example 3: " + ml.listMerge(Arrays.asList(), Arrays.asList(0)));

        System.err.println("\n Merge using linkedlist method");
        Node ll1 = ml.convertListToLinkedList(Arrays.asList(1,2,3));
        Node ll2 = ml.convertListToLinkedList(Arrays.asList(1,3,4));
        Node merged1 = ml.linkedListMerge(ll1, ll2);
        System.err.println("Example 1: " + ml.convertLinkedListToList(merged1));
        
        Node merged2 = ml.linkedListMerge(ml.convertListToLinkedList(Collections.emptyList()), ml.convertListToLinkedList(Collections.emptyList()));
        System.err.println("Example 2: " + ml.convertLinkedListToList(merged2));

        Node merged3 = ml.linkedListMerge(ml.convertListToLinkedList(Collections.emptyList()), ml.convertListToLinkedList(Arrays.asList(0)));
        System.err.println("Example 2: " + ml.convertLinkedListToList(merged3));
    }
}
