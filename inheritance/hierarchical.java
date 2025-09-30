// Superclass
abstract class Bentuk {
    public abstract float luas();
    public abstract float kelliing();
}

// Subclass 1
class Persegi extends Bentuk {
    public float sisi;

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float kelliing() {
        return 4 * sisi;
    }
}

// Subclass 2
class Lingkaran extends Bentuk {
    public float jarilari;

    @Override
    public float luas() {
        return (float) (Math.PI * jarilari * jarilari);
    }

    @Override
    public float kelliing() {
        return (float) (2 * Math.PI * jarilari);
    }
}

// Subclass 3
class Segitiga extends Bentuk {
    public float alas;
    public float tinggi;
    
    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }
    
    @Override
    public float kelliing() {
        // Asumsi segitiga sama sisi untuk simplifikasi
        return alas * 3;
    }
}