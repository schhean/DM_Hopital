public class Medecin {
    private String nom;
    private String specialite;

    public Medecin(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void soigner(Patient patient) {
        System.out.println("Le médecin " + nom + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + nom + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}
