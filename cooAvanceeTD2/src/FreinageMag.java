import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("89c09eb5-8bda-4a40-affd-aa612765f6f3")
public class FreinageMag extends Freinage {
    @objid ("aea50e0f-cecc-4048-93fc-e74dce8a74c3")
    public int prix=1500;

    @objid ("5b72fe96-e42b-4132-a5cd-0bb738937473")
    public int prix() {
		return prix;
    }

    

    @Override
	public String toString() {
		return "FreinageMag [prix=" + prix + "]";
	}



	@objid ("d3ae7d18-52f1-479f-a771-547a681a6fda")
    public FreinageMag(Voiture voit) {
		super(voit);
    }

}
