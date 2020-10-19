public class Tour extends Pile<Disque> {

    public Tour(int capa) throws ErreurPile {
	super(capa);
    }

    // Propage les exceptions levees par Pile si elles surviennent
    // Leve l'exception ErreurTour si on essaye d'empiler un Disque
    // sur un disque strictement plus petit.
    public void empiler(Disque v) throws ErreurPile {
    	if (estVide() || sommet().compareTo(v) > 0)
	    super.empiler(v);
    	else throw new ErreurPile();
    }
}
