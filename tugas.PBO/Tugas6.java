public class Tugas6 {
    public static void main(String[] args) {
        System.out.println("=== DEMO TUGAS 1: KELAS BUKU ===");
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Pemrograman Java");
        Buku buku3 = new Buku("Belajar Algoritma", "Budi Santoso");
        Buku buku4 = new Buku("Struktur Data", "Ani Wijaya", 2024);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
        buku4.tampilkanInfo();
    }
}

class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    
    public Buku() {
        this.judul = "Tidak Diketahui";
        this.pengarang = "Tidak Diketahui";
        this.tahunTerbit = 0;
    }

    
    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = "Tidak Diketahui";
        this.tahunTerbit = 0;
    }

    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 0;
    }

    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    
    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("-----------------------------------");
    }
}