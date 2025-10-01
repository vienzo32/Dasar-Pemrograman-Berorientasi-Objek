public class SingleTest {
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.merk = "Honda";
        kendaraan1.tahun = 2020;
        
        System.out.println("=== DEMO KENDARAAN ===");
        System.out.println("Merk: " + kendaraan1.merk);
        System.out.println("Tahun: " + kendaraan1.tahun);
        kendaraan1.jalankan();
        
        System.out.println("\n=== DEMO MOBIL ===");
        // Membuat objek mobil
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.tahun = 2022;
        mobil1.jumlahPintu = 4;
        
        System.out.println("Merk Mobil: " + mobil1.merk);
        System.out.println("Tahun Mobil: " + mobil1.tahun);
        System.out.println("Jumlah Pintu: " + mobil1.jumlahPintu);
        
        mobil1.jalankan();  // Method dari parent class
        mobil1.bukaPintu(); // Method dari child class
        
        System.out.println("\n=== DEMO POLIMORFISME ===");
        // Demonstrasi polimorfisme
        Kendaraan kendaraan2 = new Mobil();
        kendaraan2.merk = "Suzuki";
        kendaraan2.jalankan();
        
        // Casting untuk mengakses method khusus Mobil
        if (kendaraan2 instanceof Mobil) {
            Mobil mobil2 = (Mobil) kendaraan2;
            mobil2.jumlahPintu = 5;
            mobil2.bukaPintu();
        }
    }
}