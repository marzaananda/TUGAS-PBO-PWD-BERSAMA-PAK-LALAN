import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam,menit,detik,total;
        System.out.println("masukan jam: ");
        jam = input.nextInt();
        System.out.println("masukan menit : ");
        menit = input.nextInt();
        System.out.println("masukan detik : ");
        detik = input.nextInt();

        total = (jam * 3600) + (menit * 60) + detik;
        System.out.println(total);
    }

}
