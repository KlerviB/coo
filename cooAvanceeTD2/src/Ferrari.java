import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e6957fac-5666-48ad-b429-6abe0355598b")
public class Ferrari extends Voiture {
    public Ferrari() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ferrari(String nomModele) {
		super(nomModele);
		// TODO Auto-generated constructor stub
	}

	@objid ("4a89fb67-1657-472e-8b93-5c2f2443d272")
    public int prix() {
        return 300000;
    }

}
