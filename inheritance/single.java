// Superclass
class Kendaraan {
    public String merk;
    public int tahun;

    public void jalankan() {
        System.out.println(merk + " sedang berjalan...");
    }
}

// Subclass (single inheritance)
class Mobil extends Kendaraan {
    public int jumlahPintu;

    public void bukaPintu() {
        System.out.println("Membuka " + jumlahPintu + " pintu");
    }
}