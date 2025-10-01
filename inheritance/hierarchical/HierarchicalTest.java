public class HierarchicalTest {
    public static void main(String[] args) {
        System.out.println("=== DEMO HIERARCHICAL INHERITANCE ===");
        
        // Demo Persegi
        System.out.println("\n1. DEMO PERSEGI:");
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        System.out.println("Sisi: " + persegi.sisi + " cm");
        System.out.println("Luas Persegi: " + persegi.luas() + " cm²");
        System.out.println("Keliling Persegi: " + persegi.keliling() + " cm");
        
        // Demo Lingkaran
        System.out.println("\n2. DEMO LINGKARAN:");
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 7;
        System.out.println("Jari-jari: " + lingkaran.jariJari + " cm");
        System.out.println("Luas Lingkaran: " + String.format("%.2f", lingkaran.luas()) + " cm²");
        System.out.println("Keliling Lingkaran: " + String.format("%.2f", lingkaran.keliling()) + " cm");
        
        // Demo Segitiga
        System.out.println("\n3. DEMO SEGITIGA:");
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 4;
        System.out.println("Alas: " + segitiga.alas + " cm");
        System.out.println("Tinggi: " + segitiga.tinggi + " cm");
        System.out.println("Luas Segitiga: " + segitiga.luas() + " cm²");
        System.out.println("Keliling Segitiga: " + segitiga.keliling() + " cm");
        
        System.out.println("\n4. DEMO POLIMORFISME DENGAN ARRAY:");
        Bentuk[] bentukArray = new Bentuk[3];
        
        // Inisialisasi bentuk
        Persegi p = new Persegi();
        p.sisi = 3;
        
        Lingkaran l = new Lingkaran();
        l.jariJari = 5;
        
        Segitiga s = new Segitiga();
        s.alas = 4;
        s.tinggi = 3;
        
        bentukArray[0] = p;
        bentukArray[1] = l;
        bentukArray[2] = s;
        
        System.out.println("\nMenghitung luas dan keliling semua bentuk:");
        for (int i = 0; i < bentukArray.length; i++) {
            Bentuk bentuk = bentukArray[i];
            System.out.println("\nBentuk " + (i + 1) + ": " + bentuk.getClass().getSimpleName());
            System.out.println("Luas: " + String.format("%.2f", bentuk.luas()) + " cm²");
            System.out.println("Keliling: " + String.format("%.2f", bentuk.keliling()) + " cm");
        }
        
        System.out.println("\n5. DEMO ABSTRACT CLASS:");
        System.out.println("Semua bentuk mewarisi dari abstract class Bentuk");
        System.out.println("Setiap bentuk wajib mengimplementasi luas() dan keliling()");
        
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}