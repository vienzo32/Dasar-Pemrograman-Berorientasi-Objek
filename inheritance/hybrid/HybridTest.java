public class HybridTest {
    public static void main(String[] args) {
        System.out.println("=== DEMO HYBRID INHERITANCE ===");
        
        // Demo Kendaraan Darat
        System.out.println("\n1. DEMO KENDARAAN DARAT:");
        Darat mobil = new Darat();
        mobil.merk = "Toyota";
        mobil.jumlahRoda = 4;
        System.out.println("Merk: " + mobil.merk);
        System.out.println("Jumlah Roda: " + mobil.jumlahRoda);
        
        // Demo Kendaraan Laut
        System.out.println("\n2. DEMO KENDARAAN LAUT:");
        Laut kapal = new Laut();
        kapal.merk = "Royal Caribbean";
        kapal.berlayar = true;
        System.out.println("Merk: " + kapal.merk);
        System.out.println("Berlayar: " + kapal.berlayar);
        
        // Demo Mobil Amfibi (Hybrid)
        System.out.println("\n3. DEMO MOBIL AMFIBI (HYBRID):");
        MobilAmfibi amfibi = new MobilAmfibi();
        amfibi.merk = "WaterCar";
        amfibi.jumlahRoda = 4;
        amfibi.modelAuto = true;
        
        System.out.println("Merk: " + amfibi.merk);
        System.out.println("Jumlah Roda: " + amfibi.jumlahRoda);
        System.out.println("Model Otomatis: " + amfibi.modelAuto);
        amfibi.gantiMode();
        
        System.out.println("\n4. DEMO POLIMORFISME HYBRID:");
        
        // Polimorfisme dengan class Darat
        System.out.println("- Melalui referensi Darat:");
        Darat kendaraanDarat = new MobilAmfibi();
        kendaraanDarat.merk = "Amphibious Car";
        kendaraanDarat.jumlahRoda = 6;
        System.out.println("Merk: " + kendaraanDarat.merk);
        System.out.println("Jumlah Roda: " + kendaraanDarat.jumlahRoda);
        
        // Polimorfisme dengan interface Amfibi
        System.out.println("\n- Melalui referensi Amfibi:");
        Amfibi kendaraanAmfibi = new MobilAmfibi();
        kendaraanAmfibi.gantiMode();
        
        // Casting untuk mengakses method lengkap
        System.out.println("\n- Casting ke MobilAmfibi:");
        if (kendaraanDarat instanceof MobilAmfibi) {
            MobilAmfibi mobilAmfibi = (MobilAmfibi) kendaraanDarat;
            mobilAmfibi.modelAuto = false;
            mobilAmfibi.gantiMode();
        }
        
        System.out.println("\n5. DEMO STRUKTUR HYBRID INHERITANCE:");
        System.out.println("Kendaraan (Superclass)");
        System.out.println("    ├── Darat (Subclass 1)");
        System.out.println("    ├── Laut (Subclass 2)");
        System.out.println("    └── MobilAmfibi (Hybrid: Darat + Amfibi)");
        System.out.println("\nMobilAmfibi mewarisi dari:");
        System.out.println("- Darat (single inheritance)");
        System.out.println("- Amfibi (interface implementation)");
        
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}