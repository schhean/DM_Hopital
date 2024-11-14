import java.util.ArrayList;
import java.util.List;

public class Hopital {
    private String nom;
    private List<Patient> patients;
    private List<Medecin> medecins;

    public Hopital(String nom) {
        this.nom = nom;
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
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
}
