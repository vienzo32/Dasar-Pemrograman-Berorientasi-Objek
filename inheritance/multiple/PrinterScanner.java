// Class mengimplementsi multiple interface
class PrinterScanner implements Printer, Scanner {
    @Override
    public void cetakDokumen() {
        System.out.println("Mencetak dokumen...");
    }

    @Override
    public void scanDokumen() {
        System.out.println("Memindai dokumen...");
    }

    public void cetakDanScan() {
        cetakDokumen();
        scanDokumen();
    }
}