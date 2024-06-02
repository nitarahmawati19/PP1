package Remove;

public class StrukturListTest2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);

        // tampilkan elemen list
        System.out.print("Tampilkan elemen list: ");
        list.displayElement();

        // hapus elemen di akhir list
        System.out.println("1. Hapus elemen akhir");
        list.removeTail();

        // tampilkan elemen list
        System.out.print("Tampilan elemen list: ");
        list.displayElement();

        // hapus elemen di awal list
        System.out.println("2. Hapus elemen awal");
        list.removeHead();

        // tampilkan elemen list
        System.out.print("Tampilan elemen list: ");
        list.displayElement();

        // instruksi untuk menghapus elemen list di akhir
        System.out.println("3. Hapus elemen akhir");
        list.removeTail();

        // tampilkan elemen list setelah penghapusan lagi
        System.out.print("Tampilan elemen list: ");
        list.displayElement();
    }
}
