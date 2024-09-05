public class Voiture extends Vehicule {
    private int nombrePortes;
    private boolean automatique;

    public Voiture(String marque, String modele, int annee, double prixDeBase, int nombrePortes, boolean automatique) {
        super(marque, modele, annee, prixDeBase);
        this.nombrePortes = nombrePortes;
        this.automatique = automatique;
    }

    @Override
    public double calculerPrixLocation(int jours) {
        double prix = super.calculerPrixLocation(jours);
        if (automatique) {
            prix *= 1.10;
        }
        return prix;
    }

    @Override
    public void afficherType() {
        System.out.println("Type de véhicule : Voiture");
    }

    @Override
    public String obtenirDescription() {
        return "Voiture [Marque=" + marque + ", Modèle=" + modele + ", Année=" + annee +
                ", Portes=" + nombrePortes + ", Automatique=" + automatique + "]";
    }
}
