package inheritance;

public class Persegi extends BangunDatar {
    float sisi;
    @Override 
    public float luas(){
        System.out.print("masukan sisi : ");
        sisi = in.nextFloat();
        return sisi*sisi;
    }

    @Override 
    public float keliling(){
        System.out.print("masukan keliling : ");
        sisi=in.nextFloat();
        return 4 *sisi;
    }
}
