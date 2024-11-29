
public class Consultation {
    private String dateConsultation; 
    private String diagnostic; 
    private String traitement_prescrit; 
    private Medecin paramMed; 
    private Patient paramPat; 

    public Consultation(Medecin medecin, Patient patient, String dateConsultion, String diagnostic, String traitement_prescrit) {
        this.dateConsultation = dateConsultion; 
        this.diagnostic = diagnostic; 
        this.traitement_prescrit = traitement_prescrit; 
        this.paramMed = medecin; 
        this.paramPat = patient; 
    }

    /* GETTER'S */
    public String getDiagnostic() {
        return this.diagnostic; 
    }

    public String getDateConsultation() {
        return this.dateConsultation; 
    }

    public String getTraitement() {
        return this.traitement_prescrit; 
    }

    /* SETTER */
    public void setDate(String date) {
        this.dateConsultation = date; 
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic; 
    }

    public void setTraitement(String traitement) {
        this.traitement_prescrit = traitement; 
    }

    @Override
    public String toString() {
        return "[Consultation : " + this.dateConsultation + "] \n" + 
               "| Docteur : " + this.paramMed.getNom() + "\n" + 
               "| Patient : " + this.paramPat.getNom() + "\n" + 
               "| Diagnostic : " + this.diagnostic + "\n" + 
               "| Traitement prescrit : " + this.traitement_prescrit ;
    }



}
