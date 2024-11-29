public class Infirmier extends Personnel {
    private String unite; 

    public Infirmier(String nom, String prenom, double salaire, String unite) {
        super(nom, prenom, salaire); 
        this.unite = unite; 
    } 

    /* GETTER'*/
    public String getUnite() {
        return this.unite;
    }

    /* SETTER */
    public void setUnite(String unite) {
        this.unite = unite; 
    }

    public void soigner(Patient patient) {
        System.out.println("L'infirmier " + this.getNom() + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    // 
    @Override
    public void travailler(Patient patient) {
        soigner(patient);  
    }

    @Override
    public String toString() {
        return "Infirmier{" +
                "nom='" + this.getNom() + '\'' +
                ", unité='" + unite + '\'' +
                '}';
    }

}
