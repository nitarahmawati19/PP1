package Remove;

public class StrukturListTest {
    public static void main(String[] args) {
        // Create list dengan keyword new
        StrukturList list = new StrukturList();

        // Tambah elemen 2,9,7 di awal list
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        // Tampilkan elemen list
        System.out.print("Tampilan elemen list: ");
        list.displayElement();

        // Hapus elemen list di awal list
        System.out.println("1. Hapus elemen di awal list");
        list.removeHead();

        // Tampilkan elemen list setelah penghapusan
        System.out.print("Tampilan setelah dihapus: ");
        list.displayElement();
        
        //lakukan 3x
        System.out.println("2. Hapus elemen di awal list");
        list.removeHead();
        
        System.out.print("Tampilan setelah dihapus: ");
        list.displayElement();
        
        System.out.println("3. Hapus elemen di awal list");
        list.removeHead();
        
        System.out.print("Tampilan setelah dihapus: ");
        list.displayElement();
    }
}