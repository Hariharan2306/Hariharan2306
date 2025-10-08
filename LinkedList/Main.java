package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListOps ops = new LinkedListOps();
        ops.append(1);
        ops.append(2);
        ops.append(3);
        ops.append(4);
        ops.append(5);
        ops.print();
        ops.reverse();
        ops.print();
        ops.reverse();
        ops.print();
        ops.antiClockWise();
        ops.print();
    }
}
// 1 2 3 4 5

// 2 3 4 5 1

// 5 1 2 3 4