package tpabstr7;

public class Villa extends PropriétéPrivée {

	    private boolean avecPiscine;
	    public Villa(int id, personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
	        super(id, responsable, adresse, surface, nbPieces);
	        this.avecPiscine = avecPiscine;
	    }
	    @Override
	    public double calculImpot() {
	        double impots = super.calculImpot();
	        if (avecPiscine) impots += 200;
	        return impots;
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Avec Piscine: " + avecPiscine;
	    }
	}
	