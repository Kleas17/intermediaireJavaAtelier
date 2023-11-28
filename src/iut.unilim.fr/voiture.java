class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String marque, String modèle, int année, int nombrePortes) {
        super(marque, modèle, année);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de portes : " + nombrePortes);
    }
}