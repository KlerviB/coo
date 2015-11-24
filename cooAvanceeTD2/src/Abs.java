import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6c01522b-cf32-4b47-a65c-5d3b5feed40f")
public class Abs extends Freinage {
    @objid ("568ed0a0-6bc1-4cb8-b7f1-7ee724e5e3c3")
    public int prix = 2000;

    @objid ("ab41b2fe-6632-4fa9-84eb-b139908c8b6d")
    public int prix() {
		return prix;
    }

    @objid ("d1fb2fe5-d713-4447-96e4-a1758542fb12")
    public Abs(Voiture voit) {
    	super(voit);
    	
    }

    @objid ("1970a7d5-c893-434d-92bd-27874baaa143")
    @Override
    public String toString() {
        return "Abs [prix=" + prix + "]";
    }

}
