
public class Main {

    public static void ajouterConsultation(Hopital hopital, Medecin medecin, Patient patient, String date, String diagnostic, String traitement) {
        Consultation consultation = new Consultation(medecin, patient, date, diagnostic, traitement); 
        hopital.ajouterConsultation(consultation);
    }

    public static void ajouterRdv(Hopital hopital, Medecin medecin, Patient patient, String date) {
        RendezVous rdv = new RendezVous(medecin, patient, date); 
        hopital.ajouterRdv(rdv);
    }

    public static void main(String[] args) {
        // Création de l'hôpital
        Hopital hopital = new Hopital("Hôpital Central");

        // Création de patients
        Patient patient1 = new Patient("Alice Dupont", 30, "Grippe");
        Patient patient2 = new Patient("Bob Martin", 45, "Fracture");
        Patient patient3 = new Patient("Willy Wonka", 99, "Entorse");

        // Création de médecins
        Medecin medecin1 = new Medecin("Simon", "Dupont", 3000.0, "Généraliste");
        Medecin medecin2 = new Medecin("Emma", "Verger", 3000.0, "Orthopédiste");

        // Ajout de patients et de médecins à l'hôpital
        hopital.ajouterPatient(patient1);
        hopital.ajouterPatient(patient2);
        hopital.ajouterPatient(patient3);
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // // Affichage des patients et des médecins
        // System.out.println("Liste des patients de l'hôpital :");
        // hopital.afficherPatients();

        // System.out.println("\nListe des médecins de l'hôpital :");
        // hopital.afficherMedecins();

        // // Simulation d'un soin
        // System.out.println("\nSoin du patient Alice Dupont par le Dr. Simon :");
        // medecin1.soigner(patient1);

        // // Affichage de l'état des patients après le soin
        // System.out.println("\nListe des patients après le soin :");
        // hopital.afficherPatients();

        ajouterRdv(hopital, medecin2, patient2, "23/10/2024");
        ajouterRdv(hopital, medecin1, patient1, "04/05/2025");
        hopital.afficherLesRdv();

        ajouterConsultation(hopital, medecin2, patient2, "23/10/2024", "...", "Doliprane 3x2 6/7j");
        ajouterConsultation(hopital, medecin1, patient1, "04/05/2025", "...", "Anti-douleurs 1x3 7/7j");  
        hopital.afficherLesConsultations();

        medecin2.travailler(patient2);
        medecin1.traiterUrgence(patient1);
        
        hopital.afficheStatistique();

        
    }
}
