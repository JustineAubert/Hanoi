import java.util.ArrayList;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> extends ArrayList{
    final int capacite;
    protected ArrayList<T> pile = new ArrayList();
    
    public Pile(int capa) throws ErreurPile{
        if(capa>0)
        	this.capacite=capa;
        else throw new ErreurPile();
    }

    
    // Doit lever l'exception si la pile est pleine
    public void empiler(T v) throws ErreurPile {
    	if(pile.size()<capacite()) {
    		pile.add(v);
    	}else throw new ErreurPile();
    }

    
    // Doit lever l'exception si la pile est vide
    public void depiler() throws ErreurPile {
    	if(pile.size()<1) {
    		pile.remove(pile.size()-1);
    	}else throw new ErreurPile();
    }

    // renvoie le sommet de la pile mais ne le depile pas.
    // Doit lever l'exception si la pile est vide.
    public T sommet() throws ErreurPile{
    	if(!pile.isEmpty()) {
        return pile.get(pile.size()-1);}
    else throw new ErreurPile();
}
    
    public boolean estVide() {
       if(pile.size()==0) {
    	   return true;
       }
	return false;
    }

    public int hauteur () {
    	return pile.size();
    }

    public int capacite () {
        return capacite;
    }

    /* on imprime le sommet de pile au dessus ! */
    public void affiche () throws ErreurPile{ 
    	if(pile.isEmpty()==false) {
    		for(int i=pile.size()-1;i>=0;i-=1) {
    			System.out.println(pile.get(i));
    		}
    	}
    	else {
    		System.out.println("");
    	}
    }
}
