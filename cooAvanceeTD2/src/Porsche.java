import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f19b9cf6-9f7e-498d-8e6f-393e1cfe1e77")
public class Porsche extends Voiture {
    @objid ("af938ad6-1e10-4a5a-b29c-b384a1983c16")
    public int prix() {
        return 150000;
    }

	public Porsche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Porsche(String nomModele) {
		super(nomModele);
		// TODO Auto-generated constructor stub
	}

}
