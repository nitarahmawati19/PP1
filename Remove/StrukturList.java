//223040107_Humaira
package Remove;
import List.Node;

public class StrukturList {
    private Node HEAD;

    // Konstruktor
    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk menghapus elemen di awal list
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    // Fungsi untuk menambahkan elemen di awal list
    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Fungsi untuk mengosongkan dan menghapus referensi node
    private void dispose(Node node) {
        node.setNext(null);
        node = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Fungsi untuk menampilkan elemen list
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    
    // Fungsi untuk menghapus elemen di akhir list
    public void removeTail() {
        if (!isEmpty()) {
            Node preNode = null;
            Node lastNode = HEAD;

            // Jika satu elemen list
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                // Mencari node terakhir dan node sebelumnya
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                // Menghapus node terakhir
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }
}