class Lingkaran extends Bentuk {
    public float jariJari;

    @Override
    public float luas() {
        return (float) (Math.PI * jariJari * jariJari);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * jariJari);
    }
}