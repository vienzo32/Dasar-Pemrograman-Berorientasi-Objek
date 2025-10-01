public class MultilevelTest {
    public static void main(String[] args) {
        System.out.println("=== DEMO MULTILEVEL INHERITANCE ===");
        
        // Demo level 1: Hewan
        System.out.println("\n1. DEMO CLASS HEWAN (Level 1):");
        Hewan hewan1 = new Hewan();
        hewan1.nama = "Binatang";
        System.out.println("Nama: " + hewan1.nama);
        hewan1.makan();
        
        // Demo level 2: Mamalia
        System.out.println("\n2. DEMO CLASS MAMALIA (Level 2):");
        Mamalia mamalia1 = new Mamalia();
        mamalia1.nama = "Sapi";
        mamalia1.menyusui = true;
        System.out.println("Nama: " + mamalia1.nama);
        System.out.println("Menyusui: " + mamalia1.menyusui);
        mamalia1.makan();      // Method dari Hewan
        mamalia1.beranak();    // Method dari Mamalia
        
        // Demo level 3: Kucing
        System.out.println("\n3. DEMO CLASS KUCING (Level 3):");
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Kitty";
        kucing1.menyusui = true;
        kucing1.ras = "Persia";
        System.out.println("Nama: " + kucing1.nama);
        System.out.println("Menyusui: " + kucing1.menyusui);
        System.out.println("Ras: " + kucing1.ras);
        kucing1.makan();      // Method dari Hewan
        kucing1.beranak();    // Method dari Mamalia  
        kucing1.meong();      // Method dari Kucing
        
        System.out.println("\n4. DEMO POLIMORFISME MULTILEVEL:");
        
        // Polimorfisme dengan superclass Hewan
        System.out.println("\n- Polimorfisme dengan referensi Hewan:");
        Hewan hewan2 = new Kucing();
        hewan2.nama = "Milo";
        hewan2.makan();
        
        // Polimorfisme dengan superclass Mamalia
        System.out.println("\n- Polimorfisme dengan referensi Mamalia:");
        Mamalia mamalia2 = new Kucing();
        mamalia2.nama = "Luna";
        mamalia2.menyusui = true;
        mamalia2.makan();
        mamalia2.beranak();
        
        // Casting untuk mengakses method Kucing
        System.out.println("\n- Casting ke Kucing:");
        if (mamalia2 instanceof Kucing) {
            Kucing kucing2 = (Kucing) mamalia2;
            kucing2.ras = "Anggora";
            kucing2.meong();
        }
        
        System.out.println("\n5. DEMO HIERARKI INHERITANCE:");
        System.out.println("Hewan → Mamalia → Kucing");
        System.out.println("Setiap level menambahkan fungsionalitas baru!");
        
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}