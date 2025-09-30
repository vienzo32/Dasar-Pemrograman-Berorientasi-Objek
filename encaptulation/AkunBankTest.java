public class AkunBankTest {
    
    public static void main(String[] args) {
        AkunBank akunBank1 = new AkunBank(0);
        
        // Set saldo awal
        akunBank1.setSaldo(20);
        System.out.println("Saldo akunBank 1: " + akunBank1.getSaldo());
        
        // Test menabung
        System.out.println("\n=== TEST MENABUNG ===");
        int saldoBaru = akunBank1.menabung(50);
        System.out.println("Saldo setelah menabung 50: " + saldoBaru);
        
        // Test menabung dengan jumlah negatif
        akunBank1.menabung(-10);
        System.out.println("Saldo setelah mencoba menabung -10: " + akunBank1.getSaldo());
        
        // Test tarik tunai
        System.out.println("\n=== TEST TARIK TUNAI ===");
        System.out.println("Saldo saat ini: " + akunBank1.getSaldo());
        
        // Tarik tunai berhasil
        boolean success1 = akunBank1.tarikTunai(30);
        System.out.println("Tarik tunai 30: " + (success1 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo setelah tarik 30: " + akunBank1.getSaldo());
        
        // Tarik tunai yang akan membuat saldo < 10
        boolean success2 = akunBank1.tarikTunai(25);
        System.out.println("Tarik tunai 25: " + (success2 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo setelah tarik 25: " + akunBank1.getSaldo());
        
        // Tarik tunai yang akan membuat saldo minus
        boolean success3 = akunBank1.tarikTunai(50);
        System.out.println("Tarik tunai 50: " + (success3 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo setelah tarik 50: " + akunBank1.getSaldo());
        
        // Tarik tunai dengan jumlah negatif
        boolean success4 = akunBank1.tarikTunai(-5);
        System.out.println("Tarik tunai -5: " + (success4 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo setelah tarik -5: " + akunBank1.getSaldo());
    }
}