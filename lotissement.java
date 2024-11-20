package tpabstr7;

	public class lotissement implements GestionPropriete {
	    protected propriete[] tabProp;
	    protected int nombre;
	    public lotissement(int capacite) {
	        tabProp = new propriete[capacite];
	        nombre = 0;
	    }
	    @Override
	    public void afficherProprietes() {
	        for (int i = 0; i < nombre; i++) {
	            System.out.println(tabProp[i]);
	        }
	    }
	    @Override
	    public boolean ajouter(propriete p) {
	        if (nombre < tabProp.length) {
	            tabProp[nombre++] = p;
	            return true;
	        }
	        return false;
	    }
	    @Override
	    public boolean supprimer(propriete p) {
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i].equals(p)) {
	                tabProp[i] = tabProp[--nombre];
	                return true;
	            }
	        }
	        return false;
	    }
	    public propriete getProprieteByIndex(int i) {
	        return i >= 0 && i < nombre ? tabProp[i] : null;
	    }
	    public int getNbPieces() {
	        int total = 0;
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i] instanceof PropriétéPrivée) {
	                total += ((PropriétéPrivée) tabProp[i]).nbPieces;
	            }
	        }
	        return total;
	    }
	
}
