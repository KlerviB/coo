import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("47c04e8e-6c00-4edf-89f9-9a6c55bb743e")
public class B747 extends Jet {
    @objid ("5b98c1a2-0c25-4718-8f09-55771e8e18c3")
    public UsineJetBoeing usineJetBoeing;

    @objid ("e3969a28-e0b9-4d61-93d2-2811f53c9149")
    public B747(Fuselage fuselage, List<Reacteur> reacteur) {
        super("Boeing","B747",fuselage, reacteur);
        // TODO Auto-generated constructor stub
    }

}
