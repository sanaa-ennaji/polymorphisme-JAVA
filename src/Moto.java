public class Moto extends Vehicule {
    private boolean toutTerrain;

    public Moto(String marque, String modele, int annee, double prixDeBase, boolean toutTerrain) {
        super(marque, modele, annee, prixDeBase);
        this.toutTerrain = toutTerrain;
    }

    @Override
    public double calculerPrixLocation(int jours) {
        double prix = super.calculerPrixLocation(jours);
        if (toutTerrain) {
            prix *= 1.20;
        }
        return prix;
    }

    @Override
    public void afficherType() {
        System.out.println("Type de vehicule : Moto");
    }

    @Override
    public String obtenirDescription() {
        return "Moto [Marque=" + marque + ", Modele=" + modele + ", Annee=" + annee +
                ", Tout terrain=" + toutTerrain + "]";
    }
}
