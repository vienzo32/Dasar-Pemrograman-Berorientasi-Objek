public class MultipleTest {
    public static void main(String[] args) {
        System.out.println("=== DEMO MULTIPLE INTERFACE ===");
        
        // Membuat objek PrinterScanner
        PrinterScanner alatKantor = new PrinterScanner();
        
        System.out.println("\n1. Menggunakan method dari Interface Printer:");
        alatKantor.cetakDokumen();
        
        System.out.println("\n2. Menggunakan method dari Interface Scanner:");
        alatKantor.scanDokumen();
        
        System.out.println("\n3. Menggunakan method khusus class PrinterScanner:");
        alatKantor.cetakDanScan();
        
        System.out.println("\n4. Demo Polimorfisme dengan Interface:");
        
        // Polimorfisme dengan Interface Printer
        Printer printer = new PrinterScanner();
        System.out.println("\n- Melalui referensi Printer:");
        printer.cetakDokumen();
        
        // Polimorfisme dengan Interface Scanner
        Scanner scanner = new PrinterScanner();
        System.out.println("\n- Melalui referensi Scanner:");
        scanner.scanDokumen();
        
        System.out.println("\n5. Demo Array of Interfaces:");
        Object[] peralatan = new Object[2];
        peralatan[0] = printer;
        peralatan[1] = scanner;
        
        for (Object alat : peralatan) {
            System.out.println("\n- Memproses objek: " + alat.getClass().getSimpleName());
            if (alat instanceof Printer) {
                ((Printer) alat).cetakDokumen();
            }
            if (alat instanceof Scanner) {
                ((Scanner) alat).scanDokumen();
            }
        }
        
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}