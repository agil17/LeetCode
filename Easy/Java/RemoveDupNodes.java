public class RemoveDupNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.value == temp.next.value) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }

    }
}

class ListNode{
    int value;
    ListNode next = null;
    
    public ListNode() {

    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}


