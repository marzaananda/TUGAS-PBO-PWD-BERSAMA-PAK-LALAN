package inheritance;

public class Main {
    public static void main(String[] args) {
        BangunDatar objek1 = new BangunDatar();
        objek1.luas();
        objek1.keliling();

        System.out.println("persegi");
        Persegi kotak1 = new Persegi();
        System.out.println("luas persegi : " + kotak1.luas());
        System.out.println("keliling persegi : " + kotak1.keliling());

        System.out.println("lingkaran");
        Lingkaran bulat = new  Lingkaran();
        System.out.println("luas segitiga : " + bulat.luas());
        System.out.println("keliling segitiga : " + bulat.keliling());

        System.out.println("persegi panjang");
        Persegipanjang pPanjang = new  Persegipanjang();
        System.out.println("luas persegi panjang : " + pPanjang.luas());
        System.out.println("keliling persegi panjang : " + pPanjang.keliling());

        System.out.println("segitiga");
        Segitiga segitiga1 = new Segitiga();
        System.out.println("luas segitiga : " + segitiga1.luas());
        System.out.println("keliling segitiga : " + segitiga1.keliling());

    }
}
