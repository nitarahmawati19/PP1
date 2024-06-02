package Stack1;

public class StrukturStackTest {
    public static void main(String[] args) {
        // membuat objek stack kapasitas 3 elemen
        StrukturStack stack = new StrukturStack(3);
        
        // sebelum push
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.display();
        System.out.println();
        
        // melakukan push 3x
        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.display();
        
        // melakukan operasi pop
        System.out.println("--Operasi pop--");
        int poppedElement = stack.pop();
        System.out.println("Elemen yang di-pop: " + poppedElement);
        
     // menampilkan informasi setelah pop
        System.out.println("#Setelah pop");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.display();

    }
}
