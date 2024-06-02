package Queue;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // getter
    public int getData() {
        return data;
    }

    // setter
    public void setData(int data) {
        this.data = data;
    }

    // getter untuk next
    public Node getNext() {
        return next;
    }

    // setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }
}
