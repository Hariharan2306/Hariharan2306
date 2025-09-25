package LinkedList;

public class LinkedList {
    private Node head;

    public void appendNode(int value) {
        Node newValue = new Node(value);

        if (head == null) {
            head = newValue;
            return;
        }
        Node currNode = head;
        while (currNode.next != null)
            currNode = currNode.next;
        currNode.next = newValue;
    }

    public void prePend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public Node find(int value) {
        Node curr = head;
        while (curr.next != null) {
            if (curr.value == value)
                return curr;
            curr = curr.next;
        }
        return null;
    }

    public void delete(int value) {
        if (head == null)
            return;
        if (head.value == value)
            head = head.next;

        Node curr = head.next;
        while (curr.next != null && curr.next.value != value)
            curr = curr.next;
        if (curr != null)
            curr.next = curr.next.next;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

}
