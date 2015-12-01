import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("128932fb-3954-4f92-ba00-e977b8eb8c12")
public class B737 extends Jet {
    @objid ("6bfbddcc-566d-4e41-8d09-ced1315f951e")
    public UsineJetBoeing usineJetBoeing;

    @objid ("789d4394-10a0-46e9-8004-c3a13ddf7bd8")
    public B737(Fuselage fuselage, List<Reacteur> reacteur) {
        super("Boeing","B737",fuselage, reacteur);
        // TODO Auto-generated constructor stub
    }

}
