public class RendezVous {
    private Medecin medecin; 
    private Patient patient; 
    private String date;  

    public RendezVous(Medecin medecin, Patient patient, String date) {
        this.medecin = medecin; 
        this.patient = patient; 
        this.date = date; 
    }

    /* GETTER */
    public String getDate() {
        return this.date; 
    }

    /* SETTER */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "[Rendez-vous le : " + this.date + "] \n" + 
               "| Docteur : " + this.medecin.getNom() + "\n" + 
               "| Patient : " + this.patient.getNom() + "\n";
    }
}
