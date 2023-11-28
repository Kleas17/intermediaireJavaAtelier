class Vehicule {
    private String marque;
    private String modele;
    private int année;

    public Vehicule(String marque, String modele, int année) {
        this.marque = marque;
        this.modele = modele;
        this.année = année;
    }

    public void afficherInfos() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année : " + année);
    }
}