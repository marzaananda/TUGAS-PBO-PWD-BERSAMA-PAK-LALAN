public class Tugas8 {
    public static void main(String[] args) {
        System.out.println("=== DEMO TUGAS 3: KELAS LINGKARAN ===");
        
    
        Lingkaran lingkaran1 = new Lingkaran(7.0);   
        Lingkaran lingkaran2 = new Lingkaran(-5.5);  
        Lingkaran lingkaran3 = new Lingkaran(0); 

        System.out.println();
        lingkaran1.cetakInfo();
        lingkaran2.cetakInfo();
        lingkaran3.cetakInfo();
    }
}
class Lingkaran {
    double jariJari;


    public Lingkaran(double jariJari) {
        if (jariJari <= 0) {
            System.out.println("[Peringatan] Jari-jari (" + jariJari + ") tidak valid. Menggunakan nilai default 1.0.");
            this.jariJari = 1.0;
        } else {
            this.jariJari = jariJari;
        }
    }


    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public void cetakInfo() {
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas      : " + hitungLuas());
        System.out.println("-----------------------------------");
    }
}