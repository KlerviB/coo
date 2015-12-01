import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4b96d88-a51f-48bc-90b0-494a0d03dd1f")
public class A320 extends Jet {
    @objid ("f2a7d4ca-2fa6-4b5e-834e-0e3b5183c20b")
    public UsineJetAirbus usineJetAirbus;

    @objid ("b775c9de-0457-4ab4-8e8e-4dc26567243d")
    public A320(Fuselage fuselage, List<Reacteur> reacteur) {
        super("Airbus","A320",fuselage, reacteur);
        // TODO Auto-generated constructor stub
    }

}
