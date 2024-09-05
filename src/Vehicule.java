public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected int annee;
    protected double prixDeBase;

    public Vehicule(String marque, String modele, int annee, double prixDeBase) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prixDeBase = prixDeBase;
    }

    public double calculerPrixLocation(int jours) {
        return jours * prixDeBase;
    }

    public abstract void afficherType();

    public abstract String obtenirDescription();
}
