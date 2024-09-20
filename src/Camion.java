public class Camion extends Vehicule {
    private double capaciteMax;

    public Camion(String marque, String modele, int annee, double prixDeBase, double capaciteMax) {
        super(marque, modele, annee, prixDeBase);
        this.capaciteMax = capaciteMax;
    }

    @Override
    public double calculerPrixLocation(int jours) {
        double prix = super.calculerPrixLocation(jours);
        if (capaciteMax > 10) {
            prix *= 1.30;
        }
        return prix;
    }

    @Override
    public void afficherType() {
        System.out.println("type de vehicule : camion");
    }

    @Override
    public String obtenirDescription() {
        return "camion [marque=" + marque + ", modele=" + modele + ", Annee=" + annee +
                ", Capacite max=" + capaciteMax + " tonnes]";
    }
}
