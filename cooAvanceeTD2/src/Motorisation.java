import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b8040382-4700-420b-b09f-104cf2bce681")
public class Motorisation extends Voiture {
    @objid ("a2d251fd-328e-4a27-8fa5-d2d94b1d2572")
    public float masse;

    @objid ("f3f5a09c-d19e-4c3b-96b4-eaefa557a304")
    public float force;

    public Voiture voit;

    @objid ("8bd20374-a114-4fb9-a717-a7f674b88124")
    public Voiture getVoiture() {
    	return this.voit;
    }

    @objid ("1afcd163-22fb-4ea4-b432-5ded7337aa96")
    public float acceleration() {
    	return force/masse;
    }

    @objid ("a45ca5d3-29c7-4d8a-8d05-78b6533e8b24")
    public float distanceParcourue(int t) {
    	
    	float f=0.5f *this.acceleration()+t*t;
    	
    	return f;
    }

  
    public Motorisation( Voiture voit) {
		super();
		this.voit=voit;
	
	}

	@objid ("6acad14e-5938-47d6-885a-44c5a6734ae7")
    public int prix() {
    	return prix;
    }


	public String getModele() {
		// TODO Auto-generated method stub
		return getVoiture().getModele();
	}

}
