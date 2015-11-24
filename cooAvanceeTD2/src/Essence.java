import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7bc8b858-f9e4-4343-985e-0457b3fbe62c")
public class Essence extends Motorisation {
    @objid ("b6a6729c-b4e1-451e-950c-1db0586ad9f2")
    public int prixMotorisationEssence = 1000;

    @objid ("3a0e8bca-64ce-4286-813b-1c975c4f493c")
    public int prix() {
		return prixMotorisationEssence;
    }

    @objid ("806a9361-e2a8-4a35-a723-ab193b4dddc7")
    public Essence(Voiture voit, float force, float masse) {
    	super(voit);
    	super.force=force;
    	super.masse=masse;
    }

    @objid ("20ec3686-5b33-41df-bb58-0a173b19bb06")
    @Override
    public String toString() {
        return "Essence [prixMotorisationEssence=" + prixMotorisationEssence
                + "]";
    }

}
