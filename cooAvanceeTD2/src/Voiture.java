import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f15975bb-d183-43f0-9004-bb47150c8343")
public abstract class Voiture {
    @objid ("f4e8e2b1-8485-48e5-aabc-bdf05805e424")
    public String nomModele;

    @objid ("6bdb4544-e265-47d2-be6c-b712d7c3869f")
    public float masse;

    @objid ("770ffd49-64f0-41d2-bb3a-684ffb445b68")
    public int numero;

    @objid ("708a1bd0-3b0d-4629-aa28-1e7f3f26669c")
    public int prix;

    @objid ("3d060b90-f75e-4a31-bc4a-5a5720144e09")
    public abstract int prix();

    @objid ("dea7e09f-ede5-4575-b3d9-19c8b6b79350")
    public Voiture(String nomModele) {
        super();
        this.nomModele = nomModele;
    }

    @objid ("200f0510-09e7-42db-9f89-7eaa7dd9c90d")
    public Voiture() {
        super();
    }

    @objid ("91292d18-4efc-48d2-a4ee-0e006d7340ec")
    @Override
    public String toString() {
        return "Voiture [nomModele=" + nomModele + ", prix=" + prix + "]";
    }

	public String getModele() {
		
		return nomModele;
	}

}
