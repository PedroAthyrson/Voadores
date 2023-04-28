public class Urubu implements Voador{

    public void comeAnimalMorto() {
        System.out.println("Come a carcaça, urubu!");
    }
    @Override
    public double voar() {
        System.out.println("Voa, voa, urubu!");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana, urubu!");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa, urubu!");
        return false;
    }
}
