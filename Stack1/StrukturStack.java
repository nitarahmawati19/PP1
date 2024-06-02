package Stack1;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // method push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    // method mengecek stack kosong
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    // method mengecek stack penuh
    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    // method mendapatkan ukuran stack
    public int size() {
        return TOP + 1;
    }

    // method mendapatkan data teratas stack tanpa menghapusnya
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; 
        } else {
            return array[TOP];
        }
    }
    // method menampilkan isi stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.print("Isi stack: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    // method menghapus dan mengembalikan data teratas dari stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; 
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }
}
