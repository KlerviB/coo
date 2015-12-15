import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c05e4deb-2c12-4402-bfae-3d114d2bc756")
public class Noeud {
	
	 private ArrayList<Observateur> observateurs; 
    @objid ("cf48756b-aa28-4e71-a700-58caa59114d3")
    private String nom;

    @objid ("d4b4537c-1c70-4275-9612-fc7d105bb55d")
    private int valeur;

    @objid ("a744834c-32f0-4726-926e-f36c6b52b689")
    private int capacite;

    @objid ("7893fd5a-a38b-486b-b937-81b475af15df")
    public String toString() {
        return "Noeud [nom=" + nom + ", valeur=" + valeur + ", capacite=" + capacite + "]";
    }

    @objid ("a24ef632-0c9c-4a73-99b1-9793ec640459")
    public String getNom() {
        return this.nom;
    }

    @objid ("6bc0d72d-a1f0-4c66-a27e-435f10f7d206")
    public void setNom(String value) {
        this.nom = value;
    }

    @objid ("527fdeaf-cff6-4746-8bd6-baf75a2fc211")
    public int getValeur() {
        return this.valeur;
    }

    @objid ("d83ea927-4ecf-45f9-b212-31d9f3f020e6")
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @objid ("fb35a511-2429-4b3b-89fa-d158708aeac2")
    public int getCapacite() {
        return this.capacite;
    }

    @objid ("baafe50c-cf26-47d6-80d4-1d980a0c959b")
    public void setCapacite(int value) {
        this.capacite = value;
    }

    @objid ("b9d0e417-e109-4f14-ab13-cafdd139ee38")
    public Noeud(String unNom, int uneValeur, int uneCapacite) {
        this.setNom(unNom);
        this.majValeur(uneValeur);
        this.setCapacite(uneCapacite);
    }

    @objid ("71e78f44-e843-4c90-aff3-2dac96f54e57")
    public void majValeur(int value) {
        this.valeur = value;
    }

	public Observateur getObservateur() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setObservateur(Observateur value) {
		this.observateurs.add(value);
		
	}

}
