public class Medecin extends Personnel {
    private String specialite;

    public Medecin(String nom, String prenom, Double salaire, String specialite) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite; 
    }

    public void soigner(Patient patient) {
        System.out.println("Le médecin " + this.getNom() + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    // à finir question 6
    public void traiterUrgence(Patient patient) {
        System.out.println("[URGENCE] : Le médecin " + this.getNom() + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    @Override
    public void travailler(Patient patient) {
        soigner(patient);   
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + this.getNom() + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}
