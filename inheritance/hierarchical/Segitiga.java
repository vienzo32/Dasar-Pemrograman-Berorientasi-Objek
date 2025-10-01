class Segitiga extends Bentuk {
    public float alas;
    public float tinggi;
    
    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }
    
    @Override
    public float keliling() {
        // Asumsi segitiga sama sisi untuk simplifikasi
        return alas * 3;
    }
}