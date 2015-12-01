import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8d14e93f-654d-45d3-b722-84287f94e0fd")
public abstract class Jet {
    @objid ("f3d72620-619a-4668-90fc-07de6538c4b1")
    public String marque;

    @objid ("57b6fb46-e859-4b1c-b34d-1849a17fdd9d")
    public String modele;

    @objid ("2f86be53-5f26-4b0f-a1b6-4d2980434b49")
    public Fuselage fuselage;

    @objid ("1cde658c-2810-49ee-8e8b-41ae56398f8f")
    public List<Reacteur> reacteur = new ArrayList<Reacteur> ();

    @objid ("ae4a69c8-0c8b-4ff9-ba53-80c66c46e343")
    public Jet(String marque, String modele, Fuselage fuselage, List<Reacteur> reacteur) {
        super();
        this.marque = marque;
        this.modele = modele;
        this.fuselage = fuselage;
        this.reacteur = reacteur;
    }

    @objid ("00a12845-74c3-4e9a-9c2f-a1bb9343a7b4")
    @Override
    public String toString() {
        return "Jet [marque=" + marque + ", modele=" + modele + ", fuselage="
                + fuselage + ", reacteur=" + reacteur + "]";
    }
}
