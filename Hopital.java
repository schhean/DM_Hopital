import java.util.ArrayList;
import java.util.List;

public class Hopital {
    private String nom;
    private List<Patient> patients;
    private List<Medecin> medecins;
    private List<Consultation> lesConsultations; 
    private List<RendezVous> lesRdv; 

    public Hopital(String nom) {
        this.nom = nom;
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
        this.lesConsultations = new ArrayList<>();
        this.lesRdv = new ArrayList<>(); 
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public void afficherPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void afficherMedecins() {
        for (Medecin medecin : medecins) {
            System.out.println(medecin);
        }
    }

    public void afficherLesConsultations() {
        for (Consultation consultation : lesConsultations) {
            System.out.println(consultation.toString() + "\n");
        }
    }

    public void ajouterConsultation(Consultation consultation) {
        this.lesConsultations.add(consultation); 
    }

    public void afficherLesRdv() {
        for (RendezVous rdv : lesRdv) {
            System.out.println(rdv);
        }
    }

    public void ajouterRdv(RendezVous rdv) {
        this.lesRdv.add(rdv); 
    }

    public void afficheStatistique() {
        int nbGueri = 0; 
        for (Patient patient : patients) {
            if(patient.getMaladie().equals("Guéri")) {
                nbGueri++; 
            }
        }
         // Affichage du texte ASCII
         System.out.print(
            "┌─┐┌┬┐┌─┐┌┬┐┬┌─┐┌┬┐┬┌─┐ ┬ ┬┌─┐┌─┐\n" +
            "└─┐ │ ├─┤ │ │└─┐ │ ││─┼┐│ │├┤ └─┐\n" +
            "└─┘ ┴ ┴ ┴ ┴ ┴└─┘ ┴ ┴└─┘└└─┘└─┘└─┘\n"
        );
        System.out.println("+------------------------------------+");
        System.out.println("| Pourcentage de patient guéri : " + (nbGueri * 100)/patients.size() + "% |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nombre de patient guéri : " + nbGueri + "        |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nombre de patient encore malade : " + (patients.size() - nbGueri) + "|");
        System.out.println("+------------------------------------+");
    }

}
 