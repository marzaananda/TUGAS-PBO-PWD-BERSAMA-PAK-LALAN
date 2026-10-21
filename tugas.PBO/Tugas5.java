import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Sepeda sepedaPolygon = new Sepeda("Polygon");
        System.out.println("Object Merk Sepeda: Polygon");
        System.out.println("Object Polygon dibuat, jarak tempuh awal 0 km");

        int pilihan;

        
        do {
            System.out.println("Menu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");

            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    sepedaPolygon.gerakMaju();
                    break;
                case 2:
                    sepedaPolygon.gerakMundur();
                    break;
                case 3:
                    sepedaPolygon.berhenti();
                    break;
                case 0:
                    System.out.println("Keluar Program ..");
                    System.out.println("Terimakasih sudah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println(); 
        } while (pilihan != 0);

        scanner.close();
    }
}

class Sepeda {
    private String merk;
    private int jarakTempuh;

    
    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;
    }

    
    public void gerakMaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        tampilkanStatus();
    }

    
    public void gerakMundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        tampilkanStatus();
    }

    
    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }

    
    public void tampilkanStatus() {
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }
}