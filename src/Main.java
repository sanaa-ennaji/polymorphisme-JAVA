import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicule> vehicules = new ArrayList<>();


        vehicules.add(new Voiture("Toyota", "Corolla", 2020, 50, 4, true));
        vehicules.add(new Moto("Yamaha", "MT-07", 2019, 30, true));
        vehicules.add(new Camion("Mercedes", "Actros", 2021, 100, 12));


        for (Vehicule vehicule : vehicules) {
            vehicule.afficherType();
            System.out.println(vehicule.obtenirDescription());
            System.out.println("Prix de location pour 5 jours : " + vehicule.calculerPrixLocation(5)); // Calculer le prix de location pour 5 jours
            System.out.println("--------------------------------------");
        }
    }
}
