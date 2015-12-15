import java.util.ArrayList;


public class NoeudSujet extends Noeud implements Sujet {
	
	private ArrayList<Observateur> observateurs ;
	
	public NoeudSujet(String nom, int valeur, int capacite) {
		super(nom, valeur, capacite) ;
		this.observateurs = new ArrayList<Observateur>() ;
	}
	public void enregistrerObservateur(Observateur o)
	{
		this.observateurs.add(o) ;
	}
	public void supprimerObservateur(Observateur o)
	{
		this.observateurs.remove(o) ;
	}
	public void notifierObservateur()
	{
		for(int i = 0 ; i < this.observateurs.size(); i++)
		{
			this.observateurs.get(i).actualiser(this.getValeur());
		}
	}
	
	public void changementValeur(int valeur) {
	this.setValeur(this.getValeur()+valeur*this.getCapacite());
	this.notifierObservateur();
	}
	
	public Observateur getObservateur() {
	// TODO Auto-generated method stub
	return null;
	}
	
	public void setObservateur(Observateur value) {
		this.observateurs.add(value) ;
	}

}
