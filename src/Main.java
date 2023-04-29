import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RepositorioDeVoadores voadores = new RepositorioDeVoadores();

        Random r = new Random();
        for (int i = 0; i < 10 ; i++) {
            int escolhaAleatoria = r.nextInt(3);
            switch (escolhaAleatoria){
                case 0:
                    System.out.println("\nGalinha!");
                    voadores.adicionaVoador(new GalinhaVoadora());
                    break;
                case 1:
                    System.out.println("\nDrone!");
                    voadores.adicionaVoador(new Drone("Tipo Premium"));
                    break;
                case 2:
                    System.out.println("\nUrubu!");
                    voadores.adicionaVoador(new Urubu());
                    break;
            }
            voadores.fazVoar(i); //chamada polimórfica
            voadores.fazPlanar(i); //chamada polimórfica
            voadores.fazPousar(i); //chamada polimórfica

        }

    }
}