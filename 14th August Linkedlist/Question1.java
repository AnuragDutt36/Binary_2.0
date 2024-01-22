class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Example 1
        LinkedList list1 = new LinkedList();
        list1.insert(14);
        list1.insert(21);
        list1.insert(11);
        list1.insert(30);
        list1.insert(10);

        int key1 = 14;
        if (list1.search(key1)) {
            System.out.println("Example 1 - Output: Yes");
        } else {
            System.out.println("Example 1 - Output: No");
        }

        // Example 2
        LinkedList list2 = new LinkedList();
        list2.insert(6);
        list2.insert(21);
        list2.insert(17);
        list2.insert(30);
        list2.insert(10);
        list2.insert(8);

        int key2 = 13;
        if (list2.search(key2)) {
            System.out.println("Example 2 - Output:Yes");
        } else {
            System.out.println("Example 2 - Output:No");
        }
    }
}
