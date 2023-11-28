public class Main {
    public static main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Camry", 2020, 4);
        Moto maMoto = new Moto("Honda", "CBR500R", 2022, true);

        System.out.println("Informations sur la voiture :");
        maVoiture.afficherInfos();

        System.out.println("\nInformations sur la moto :");
        maMoto.afficherInfos();
    }


}