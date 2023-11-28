class Vehicule {
    private String marque;
    private String modèle;
    private int année;

    public Vehicule(String marque, String modèle, int année) {
        this.marque = marque;
        this.modèle = modèle;
        this.année = année;
    }

    public void afficherInfos() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modèle);
        System.out.println("Année : " + année);
    }
}