package tpabstr7;

	public class fascalite {
	    public static void main(String[] args) {
	        personne p1 = new personne(1, "Ali", "Ahmed");
	        personne p2 = new personne(2, "Sara", "Ben");
	        personne p3 = new personne(3, "Mouna", "Khaled");
	        lotissement lotissement = new lotissement(10);
	        lotissement.ajouter(new PropriétéPrivée(1, p1, "Corniche", 350, 4));
	        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
	        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
	        lotissement.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
	        lotissement.ajouter(new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));
	        lotissement.afficherProprietes();
	        System.out.println("Nombre total de pièces: " + lotissement.getNbPieces());
	    }
	}

