package LinkedList;

public class LinkedListOps {
    Node head;

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
    }

    public void prePend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public Node find(int value) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.value == value)
                return currNode;
            currNode = currNode.next;
        }
        return null;
    }

    public void delete(int value) {
        if (head == null)
            return;
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node currNode = head;
        while (currNode.next != null && currNode.next.value != value)
            currNode = currNode.next;

        if (currNode.next != null)
            currNode.next = currNode.next.next;

    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void antiClockWise() {
        if (head == null)
            return;
        Node temp = head;
        head = head.next;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = temp;
        temp.next = null;
    }
}

// 1 2 3
