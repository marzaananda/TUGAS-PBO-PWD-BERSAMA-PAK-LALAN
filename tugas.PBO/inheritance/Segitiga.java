package inheritance;

public class Segitiga extends BangunDatar {
    float alas, tinggi;

    void input() {
        System.out.print("masukan alas: ");
        alas = in.nextFloat();
        System.out.print("masukan tinggi: ");
        tinggi = in.nextFloat();
    }

    @Override
    public float luas() {
        input();
        return alas * tinggi / 2;
    }

    @Override
    public float keliling() {
        input();
        float miring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas * tinggi * miring;
    }
}
