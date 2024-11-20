package tpabstr7;

public class PropriétéPrivée  extends propriete  {
	
	    int nbPieces;
	    public PropriétéPrivée(int id, personne responsable, String adresse, double surface, int nbPieces) {
	        super(id, responsable, adresse, surface);
	        this.nbPieces = nbPieces;
	    }
	    @Override
	    public double calculImpot() {
	        return (surface / 100) * 50 + nbPieces * 10;
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Nb Pièces: " + nbPieces;
	    }
	}
	

