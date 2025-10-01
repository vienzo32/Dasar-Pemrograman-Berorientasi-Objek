class MobilAmfibi extends Darat implements Amfibi {
    public boolean modelAuto;

    @Override
    public void gantiMode() {
        if (modelAuto) {
            System.out.println("Mode otomatis: Bisa di darat dan air");
        } else {
            System.out.println("Mode manual: Pilih darat atau air");
        }
    }
}