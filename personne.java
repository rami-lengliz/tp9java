package tpabstr7;

public class personne {
    private int cin;
    private String nom;
    private String prenom;
    // Constructor
    public personne(int cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }
    public int getCin() { return cin; }
    public void setCin(int cin) { this.cin = cin; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    @Override
    public String toString() {
        return "CIN: " + cin + ", Nom: " + nom + ", Prénom: " + prenom;
    }
}