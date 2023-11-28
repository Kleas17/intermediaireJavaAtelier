class Moto extends Vehicule {
    private boolean aUnTopCase;

    public Moto(String marque, String modèle, int année, boolean aUnTopCase) {
        super(marque, modèle, année);
        this.aUnTopCase = aUnTopCase;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("A un top case : " + (aUnTopCase ? "Oui" : "Non"));
    }
}