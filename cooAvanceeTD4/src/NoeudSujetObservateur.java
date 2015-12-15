import java.util.ArrayList;


public class NoeudSujetObservateur extends NoeudSujet implements Observateur {

	
	
	public NoeudSujetObservateur(ArrayList<Sujet> s,String nom, int valeur, int capacite) {
	super(nom, valeur, capacite) ;
	for (int i = 0 ; i < s.size(); i++)
	{
		s.get(i).setObservateur(this) ;
	}
	}
	
	public void actualiser(int v)
	{
		this.majValeur(this.getValeur()+v*this.getCapacite());
		this.notifierObservateur() ;
	}
	
	}