import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicule> vehicules = new ArrayList<>();


        vehicules.add(new Voiture("toyota", "Corolla", 2024, 50, 4, true));
        vehicules.add(new Camion("mercedes", "Actros", 2023, 100, 12));


        for (Vehicule vehicule : vehicules) {
            vehicule.afficherType();
            System.out.println(vehicule.obtenirDescription());
            System.out.println("Prix de location pour 5 jours : " + vehicule.calculerPrixLocation(5));
            System.out.println("--------------------------------------");
        }
    }
}
