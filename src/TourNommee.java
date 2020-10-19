// Une sous-classe de Tour dans laquelle chaque mouvement donne un message
public class TourNommee extends Tour {

    protected String nom;

    public TourNommee(int nb, String n) throws ErreurPile {
	super(nb); nom = n;
    }

    public void empiler(Disque d) throws ErreurPile {
	System.out.println("On empile " + d.toString() + " sur " + nom);
	super.empiler(d);
    }

    public void depiler() throws ErreurPile {
	System.out.println("On depile " + nom);
	super.depiler();
    }

    public void affiche() throws ErreurPile{
	System.out.println(nom + ":"); super.affiche();
    }
}
