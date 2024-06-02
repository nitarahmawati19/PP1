package Reference.Tugas_7;

public class StrukturList {
    private Node head;
    private Node tail;

    public StrukturList() {
        this.head = null;
        this.tail = null;
    }

    // addTail
    public void addTail(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // metode findList
    public Mahasiswa findList(String nrp) {
        Node current = head;
        while (current != null) {
            if (current.getData().getNrp().equals(nrp)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null; // Jika elemen tidak ditemukan
    }

    // metode mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // metode menghitung jumlah elemen
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
