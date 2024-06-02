package Reference.Tugas_7;

public class ListMahasiswa {
	private Node head;
    private Node tail;

    public ListMahasiswa() {
        this.head = null;
        this.tail = null;
    }

    // method addTail
    public void addTail(Mahasiswa data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // method findList
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
}