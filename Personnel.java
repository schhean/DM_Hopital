public abstract class Personnel {
    private String nom; 
    private String prenom; 
    private double salaire; 

    /* Constructeur */
    public Personnel(String _nom, String _prenom, double _salaire) {
        this.nom = _nom; 
        this.prenom = _prenom; 
        this.salaire = _salaire; 
    } 

    /* GETTER'S */
    public String getNom() {
        return this.nom; 
    }

    public String getPrenom() {
        return this.prenom; 
    }

    public Double getSalaire() {
        return this.salaire; 
    }

    /* SETTER'S */
    public void setNom(String _nom) {
        this.nom = _nom; 
    }

    public void setPrenom(String _prenom) {
        this.nom = _prenom; 
    }

    public void setSalaire(String _salaire) {
        this.nom = _salaire; 
    }

    /* Méthode */
    public abstract void travailler(Patient patient);

    // Fonction à faire
    @Override
    public abstract String toString();

}
