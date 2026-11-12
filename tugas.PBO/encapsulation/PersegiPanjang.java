public class PersegiPanjang {
    float panjang;
    float lebar;

    private float Luas() {
        return panjang * lebar;
    };

    private float keliling() {
        return 2 *(panjang + lebar);
    };

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    };
    public void setLebar(float lebar) {
        this.lebar = lebar;
    };

    public float getLuas() {
        return  Luas();
    };
    public float getlebar() {
        return lebar;
        
    };
    public float getPanjang() {
        return panjang;
    };

    public float getKeliling() {
        return keliling();
    };
}
