package List;

public class List {
		private Node HEAD;

	    // konstruktor
	    public List() {
	        HEAD = null;
	    }

	    // menambahkan elemen baru di awal list
	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        newNode.setNext(HEAD);
	        HEAD = newNode;
	    }

	    // menampilkan elemen-elemen dalam list
	    public void displayElement() {
	        Node curNode = HEAD;
	        while (curNode != null) {
	            System.out.print(curNode.getData() + " ");
	            curNode = curNode.getNext();
	        }
	    }

	    // merepresentasikan elemen dalam list
	    private class Node {
	        private int data;
	        private Node next;

	        // konstruktor Node
	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }

	        // getter dan setter data
	        public int getData() {
	            return data;
	        }

	        // getter dan setter next
	        public Node getNext() {
	            return next;
	        }

	        public void setNext(Node next) {
	            this.next = next;
	        }
	    }

	    // fungsi main untuk mengeksekusi program
	    public static void main(String[] args) {
	        List myList = new List();
	        // menambahkan elemen ke dalam list
	        myList.addFirst(1);
	        myList.addFirst(10);
	        myList.addFirst(16);
	        myList.addFirst(28);

	        // menampilkan elemen-elemen dalam list
	        System.out.println("Elemen dalam list:");
	        myList.displayElement();
	    }
}