package tpabstr7;

	public class PropriétéProfessionnelle extends propriete {
	    private int nbEmployes;
	    private boolean estEtatique;
	    public PropriétéProfessionnelle(int id, personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
	        super(id, responsable, adresse, surface);
	        this.nbEmployes = nbEmployes;
	        this.estEtatique = estEtatique;
	    }
	   
	    public double calculImpot() {
	        return estEtatique ? 0 : (surface / 100) * 100 + nbEmployes * 30;
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Nb Employés: " + nbEmployes + ", Est État: " + estEtatique;
	    }
	}

