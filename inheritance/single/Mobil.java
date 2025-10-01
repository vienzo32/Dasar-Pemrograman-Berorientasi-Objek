// Subclass (single inheritance)
class Mobil extends Kendaraan {
    public int jumlahPintu;

    public void bukaPintu() {
        System.out.println("Membuka " + jumlahPintu + " pintu");
    }
}