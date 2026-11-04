package inheritance;

public class Persegipanjang extends BangunDatar {
    float panjang,lebar;
    void input(){
        System.out.print("masukan panjang: ");
        panjang = in.nextFloat();
        System.out.print("masukan lebar: ");
        lebar = in.nextFloat();
    }
    @Override 
    public float luas (){
        input();
        return panjang*lebar;
    }
    @Override 
    public float keliling(){
        input();
        return 2*(panjang*lebar);
    }
}
