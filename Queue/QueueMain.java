package Queue;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // sebelum melakukan enqueue
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        // melakukan operasi enqueue 4x
        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        // setelah melakukan enqueue
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        
        // melakukan operasi dequeue
        System.out.println("### Dequeue ###");
        int removedElement = queue.dequeue();
        System.out.println("Elemen yang dihapus: " + removedElement);

        // setelah melakukan dequeue
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}
