package Reference.Tugas_7;

public class ListTest {
        public static void main(String[] args) {
            StrukturList list = new StrukturList();
    
            // menambahkan addTail
            list.addTail(new Mahasiswa("223040030", "Nita Rahmawati", "2002-07-19"));
            list.addTail(new Mahasiswa("223040055", "Carlos Sainz", "1994-09-01"));
    
            // findList
            Mahasiswa mahasiswa1 = list.findList("223040107");
            if (mahasiswa1 != null) {
                System.out.println("Mahasiswa ditemukan: " + mahasiswa1.getNama());
            } else {
                System.out.println("Mahasiswa tidak ditemukan");
            }
    
            Mahasiswa mahasiswa2 = list.findList("223040108");
            if (mahasiswa2 != null) {
                System.out.println("Mahasiswa ditemukan: " + mahasiswa2.getNama());
            } else {
                System.out.println("Mahasiswa tidak ditemukan");
            }
    
            // menampilkan jumlah elemen
            System.out.println("Jumlah elemen dalam list: " + list.size());
        }
}