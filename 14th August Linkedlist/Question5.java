class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question5 {
    public ListNode addLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
    
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Question5 solution = new Question5();
        
        // Example 1
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(6);
        list1.next.next = new ListNode(3);
        
        ListNode list2 = new ListNode(8);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(2);
        
        ListNode result1 = solution.addLists(list1, list2);
        solution.printList(result1);
        
        // Example 2
        ListNode list3 = new ListNode(7);
        list3.next = new ListNode(5);
        list3.next.next = new ListNode(9);
        list3.next.next.next = new ListNode(4);
        list3.next.next.next.next = new ListNode(6);
        
        ListNode list4 = new ListNode(8);
        list4.next = new ListNode(4);
        
        ListNode result2 = solution.addLists(list3, list4);
        solution.printList(result2);
    }
}
