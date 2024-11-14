public class Main {
    public static void main(String[] args) {
        // Création de l'hôpital
        Hopital hopital = new Hopital("Hôpital Central");

        // Création de patients
        Patient patient1 = new Patient("Alice Dupont", 30, "Grippe");
        Patient patient2 = new Patient("Bob Martin", 45, "Fracture");

        // Création de médecins
        Medecin medecin1 = new Medecin("Dr. Simon", "Généraliste");
        Medecin medecin2 = new Medecin("Dr. Emma", "Orthopédiste");

        // Ajout de patients et de médecins à l'hôpital
        hopital.ajouterPatient(patient1);
        hopital.ajouterPatient(patient2);
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Affichage des patients et des médecins
        System.out.println("Liste des patients de l'hôpital :");
        hopital.afficherPatients();

        System.out.println("\nListe des médecins de l'hôpital :");
        hopital.afficherMedecins();

        // Simulation d'un soin
        System.out.println("\nSoin du patient Alice Dupont par le Dr. Simon :");
        medecin1.soigner(patient1);

        // Affichage de l'état des patients après le soin
        System.out.println("\nListe des patients après le soin :");
        hopital.afficherPatients();
    }
}
