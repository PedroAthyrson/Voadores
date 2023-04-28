public class Urubu implements Voador{

    private boolean encontrouAnimaisMortos = false;

    public void comerCarcaça(){
        encontrouAnimaisMortos = true;
    }

    public boolean isEncontrouAnimaisMortos() {
        return encontrouAnimaisMortos;
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
