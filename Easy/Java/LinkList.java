

public class LinkList {
    Node root;
    LinkList() {
        this.root = null;
    }
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static LinkList insert(LinkList list, int val) {
        Node newNode = new Node(val);

        if(list.root == null) {
            list.root = newNode;
        }
        else {
            Node current = list.root;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return list;
        
    }

    public static void print(LinkList list) {
        Node current = list.root;

        while(current != null) {
            System.out.printf("%d ", current.val);
            current = current.next;
        }
        System.out.println();
    }

    public static LinkList populate(LinkList list) {
        for(int i = 1; i <= 10; i++) {
            list = insert(list, i);
        }
        return list;
    }

    public static LinkList reverse(LinkList list) {
        Node current = list.root;
        Node prev = null;

        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;   
        }
        list.root = prev;
        return list;
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list = populate(list);
        list = reverse(list);
        print(list);
        
        
    }
}
