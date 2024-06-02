package RemoveMid;
import List.Node;

public class StrukturList {
	
	    private Node HEAD;

	    // konstruktor
	    public StrukturList() {
	        this.HEAD = null;
	    }

	    // fungsi menghapus elemen di awal list
	    public void removeHead() {
	        if (isEmpty()) {
	            System.out.println("List kosong");
	        } else {
	            Node temp = HEAD;
	            HEAD = HEAD.getNext();
	            dispose(temp);
	        }
	    }

	    // fungsi menambahkan elemen di awal list
	    public void addHead(int data) {
	        Node newNode = new Node(data);
	        newNode.setNext(HEAD);
	        HEAD = newNode;
	    }

	    // fungsi mengosongkan dan menghapus referensi node
	    private void dispose(Node node) {
	        node.setNext(null);
	        node = null;
	    }

	    // fungsi mengecek apakah list kosong
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    // fungsi menampilkan elemen list
	    public void displayElement() {
	        Node curNode = HEAD;
	        while (curNode != null) {
	            System.out.print(curNode.getData() + " ");
	            curNode = curNode.getNext();
	        }
	        System.out.println();
	    }
	    
	    // fungsi menghapus elemen di akhir list
	    public void removeTail() {
	        if (!isEmpty()) {
	            Node preNode = null;
	            Node lastNode = HEAD;

	            // jika satu elemen list
	            if (HEAD.getNext() == null) {
	                HEAD = null;
	            } else {
	                // mencari node terakhir dan node sebelumnya
	                while (lastNode.getNext() != null) {
	                    preNode = lastNode;
	                    lastNode = lastNode.getNext();
	                }

	                // menghapus node terakhir
	                preNode.setNext(null);
	                dispose(lastNode);
	            }
	        }
	    }
	    public void removeMid(int e) {
	        Node preNode = null;
	        Node tempNode = HEAD;
	        boolean ketemu = false;

	        if (isEmpty()) {
	            System.out.println("Elemen list kosong");
	        } else {
	            int i = 1;

	            while (tempNode != null && !ketemu) {
	                if (tempNode.getData() == e) {
	                    ketemu = true;
	                } else {
	                    preNode = tempNode;
	                    tempNode = tempNode.getNext();
	                    i++;
	                }
	            }

	            if (ketemu) {
	                if (i == 1) {
	                    HEAD = null;
	                } else {
	                    preNode.setNext(tempNode.getNext());
	                    dispose(tempNode);
	                }
	            }
	        }
	    }
}
