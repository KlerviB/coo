import java.util.ArrayList;


public class TestObservateur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NoeudSujet noeud0 = new NoeudSujet("noeud0", 0, 2) ;
		ArrayList<Sujet> s = new ArrayList<Sujet>() ;
			s.add(noeud0) ;
		NoeudSujetObservateur noeud1 = new NoeudSujetObservateur(s, "noeud1", 0, 1) ;
		NoeudSujetObservateur noeud2 = new NoeudSujetObservateur(s, "noeud2", 0, 4) ;
		ArrayList<Sujet> s2 = new ArrayList<Sujet>() ;
			s2.add(noeud1) ;
			s2.add(noeud2) ;
		Observateur noeud3 = new NoeudObservateur(s2, "noeud3", 0, 3) ;

		System.out.println(noeud0);
		System.out.println(noeud1);
		System.out.println(noeud2);
		System.out.println(noeud3);
		System.out.println();
		
		noeud0.changementValeur(1);
		
		System.out.println(noeud0);
		System.out.println(noeud1);
		System.out.println(noeud2);
		System.out.println(noeud3);
		
		
	}

}
