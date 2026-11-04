package inheritance;

public class Lingkaran extends BangunDatar {
    float r;
    @Override 
    public float luas(){
        System.out.print("masukan luas : ");
        r=in.nextFloat();
        return 3.14f*r*r;
    }
    @Override 
    public float keliling(){
        System.out.println("masukan keliling : ");
        r=in.nextFloat();
        return 2*3.14f*r;
    }
}
