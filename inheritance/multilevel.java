// Superclass level 1
class Hewan {
    public String nama;

    public void makan() {
        System.out.println(nama + " sedang makan...");
    }
}

// Subclass level 2
class Mamalia extends Hewan {
    public boolean menyusui;

    public void beranak() {
        System.out.println(nama + " sedang beranak...");
    }
}

// Subclass level 3
class Kucing extends Mamalia {
    public String ras;

    public void meong() {
        System.out.println(nama + " (" + ras + ") mengeluarkan suara: Meong!");
    }
}