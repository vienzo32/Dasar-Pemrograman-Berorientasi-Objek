// Superclass
class Kendaraan {
    public String merk;
}

// Subclass 1
class Darat extends Kendaraan {
    public int jumlahRoda;
}

// Subclass 2
class Laut extends Kendaraan {
    public boolean berlayan;
}

// Hybrid subclass (multiple melalui interface)
interface Amfibi {
    void gantiMode();
}

class MobilAmfibi extends Darat implements Amfibi {
    public boolean modelAuto;

    @Override
    public void gantiMode() {
        if (modelAuto) {
            System.out.println("Mode otomatis: Bisa di darat dan air");
        } else {
            System.out.println("Mode manual: Pillh darat atau air");
        }
    }
}