package Java;

public class MergedLinkedList {
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
    
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(0);
        ListNode l3 = tempHead;
        
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            }
            else {
                l3.next = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) {
            l3.next = l1;
            l1 = l1.next;
        }
        if(l2 != null) {
            l3.next = l2;
            l2= l2.next;
        }
        return tempHead.next;
    }
}
