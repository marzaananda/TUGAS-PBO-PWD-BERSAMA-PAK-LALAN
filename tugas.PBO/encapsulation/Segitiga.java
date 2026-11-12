
public class Segitiga {

    private float alas;
    private float tinggi;

    private float Luas() {
        return alas * tinggi * 0.5f;
    }

    private float keliling() {
        float sisiMiring = (float) Math.sqrt(
            (alas * alas) + (tinggi * tinggi)
        );

        return alas + tinggi + sisiMiring;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getLuas() {
        return Luas();
    }

    public float getKeliling() {
        return keliling();
    }
}
