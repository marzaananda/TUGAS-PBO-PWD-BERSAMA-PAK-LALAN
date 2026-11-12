public class Persegi extends BangunDatar{
    private float sisi;

    private float Luas() {
        return sisi * sisi;
    };

    protected float keliling() {
        return sisi * sisi * sisi * sisi;
    };

    public void setSisi(float sisi) {
        this.sisi = sisi;
    };

    public float getluas() {
        return Luas();
    };

    public float getKeliling() {
        return keliling();
    };

}
