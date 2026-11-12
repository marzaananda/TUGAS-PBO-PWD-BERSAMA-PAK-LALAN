
public class Lingkaran extends BangunDatar {

    private float jari;

    @Override
    protected float luas() {
        return (float) (Math.PI * jari * jari);
    }

    @Override
    protected float keliling() {
        return (float) (2 * Math.PI * jari);
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}
