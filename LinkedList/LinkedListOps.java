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
        // 1 2 3 4 5
        // 2 3 4 5 1
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

    public boolean detectIsCycle() {
        if (head == null)
            return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public void removeNthNode(int n) {
        if (head == null)
            return;
        Node last = head;
        int depth = 1;
        while (last.next != null) {
            last = last.next;
            depth++;
        }
        int deleteIndex = depth - n + 1;
        last = head;
        for (int i = 1; i < deleteIndex && last.next != null; i++) {
            last = last.next;
        }
        last.next = last.next.next;
    }

    public void clockWise() {
        // 1 2 3 4 5
        // 5 1 2 3 4
        if (head == null)
            return;
        Node newlast = head;
        while (newlast.next.next != null)
            newlast = newlast.next;

        newlast.next.next = head;
        head = newlast.next;
        newlast.next = null;
    }

    public void rotate(int k) {
        if (k > 0) {
            for (int i = 0; i < k; i++)
                clockWise();
        } else {
            for (int i = 0; i < -k; i++)
                antiClockWise();
        }
    }

    public void optimisedRotate(int k) {
        if (head == null || head.next == null || k == 0)
            return;

        int n = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        k %= n;
        if (k < 0)
            k = n + k;
        if (k == 0)
            return;
        tail.next = head;
        Node newtail = head;
        for (int i = 0; i < n - 1 - k; i++)
            newtail = newtail.next;
        head = newtail.next;
        newtail.next = null;
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }
}

// 1 2 3
