package tpabstr7;

public class LotissementPrivée extends lotissement {
    public LotissementPrivée(int capacite) {
        super(capacite);
    }
    @Override
    public boolean ajouter(propriete p) {
        if (p instanceof PropriétéPrivée) {
            return super.ajouter(p);
        }
        System.out.println("Seules les propriétés privées peuvent être ajoutées.");
        return false;
    }
    public PropriétéPrivée getProprieteByIndex(int i) {
        propriete prop = super.getProprieteByIndex(i);
        if (prop instanceof PropriétéPrivée) {
            return (PropriétéPrivée) prop;
        }
        return null;
    }
    @Override
    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropriétéPrivée) {
                totalPieces += ((PropriétéPrivée) tabProp[i]).nbPieces;
            }
        }
        return totalPieces;
    }
}
