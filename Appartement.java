package tpabstr7;

	public class Appartement extends PropriétéPrivée {
	    private int numEtage;
	    public Appartement(int id, personne responsable, String adresse, double surface, int nbPieces, int numEtage) {
	        super(id, responsable, adresse, surface, nbPieces);
	        this.numEtage = numEtage;
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Numéro d'Étage: " + numEtage;
	    }
	}


