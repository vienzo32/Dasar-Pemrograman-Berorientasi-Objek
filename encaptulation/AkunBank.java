public class AkunBank {

    private int saldo;

    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public int menabung(int saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            return this.saldo;
        } else {
            return 0;
        }
    }
    
    public boolean tarikTunai(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
            return false;
        }
        
        if (this.saldo - jumlah < 0) {
            System.out.println("Tidak boleh minus");
            return false;
        }
        
        if (this.saldo - jumlah < 10) {
            System.out.println("Saldo harus sisa minimal 10");
            return false;
        }
        
        this.saldo -= jumlah;
        System.out.println("Tarik tunai berhasil coy");
        return true;
    }
}