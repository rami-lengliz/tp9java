package tpabstr7;

public abstract class propriete {
    private int id;
    private personne responsable;
    private String adresse;
    protected double surface;
    
    public propriete(int id, personne responsable, String adresse, double surface) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Responsable: " + responsable + ", Adresse: " + adresse + ", Surface: " + surface + " m²";
    }
    public abstract double calculImpot();
}