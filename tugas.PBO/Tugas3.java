import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        float jari,keliling,luas;
        float pi = 3.14f;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan Jari jari");
        jari = input.nextFloat();
        luas = pi*jari;
        keliling = 2*pi*jari;

        System.out.println(luas);
        System.out.println(keliling);
    
    }
}
