import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c08a187d-c22a-43ed-ab04-94a35d3a3495")
public class A380 extends Jet {
    @objid ("5769d4fd-273f-4013-8a51-8878e87fff5c")
    public UsineJetAirbus usineJetAirbus;

    @objid ("8e4e9921-8822-4a29-85be-eded9686c025")
    public A380(Fuselage fuselage, List<Reacteur> reacteur) {
        super("Airbus","A380",fuselage, reacteur);
        // TODO Auto-generated constructor stub
    }

}
