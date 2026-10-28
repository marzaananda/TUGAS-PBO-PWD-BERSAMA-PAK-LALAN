public class Tugas7 {
    public static void main(String[] args) {
        System.out.println("=== DEMO TUGAS 2: KELAS MOBIL ===");
        
        
        Mobil mobil1 = new Mobil("Toyota", "Avanza");
        
        
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023);

        mobil1.cetakInfo();
        mobil2.cetakInfo();
    }
}
class Mobil {
    String merek;
    String model;
    int tahun;

    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        this.tahun = 2025; 
    }

    
    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    
    public void cetakInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("-----------------------------------");
    }
}