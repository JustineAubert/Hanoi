import java.util.ArrayList;

// Une sous-classe de Hanoi qui utilise des instances de TourNommee
public class HanoiNommee extends Hanoi {

    public HanoiNommee(ArrayList<Disque> a) throws ErreurPile {
	int nb = a.size();
	depart = new TourNommee(nb, "Depart");
	milieu = new TourNommee(nb, "Milieu");
	arrivee = new TourNommee(nb, "Arrivee");
	for(Disque d : a) {
	    depart.empiler(d);
	}
    }

    // On redefinit l'affichage puisqu'il n'y a pas besoin d'ajouter de texte
    // devant les tours !
    public void affiche() throws ErreurPile {
	depart.affiche(); milieu.affiche(); arrivee.affiche();
    }


    static public void main (String[] args) throws ErreurPile, ErreurTour {
	ArrayList<Disque> a = new ArrayList<>();

	for(int i = 6; i > 0; i -= 1) {
	    a.add(new Disque(i));
	}
	HanoiNommee h = new HanoiNommee(a);
        h.affiche();
	h.jouer();
	System.out.println("Situation finale:");
        h.affiche();
    }
}
