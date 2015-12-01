import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("405c231b-b4d3-4f5b-9d86-310beb135401")
public class Fuselage {
    @objid ("7bc2189b-f9a7-4e5e-9253-92cf4d522a62")
    public int capacite;

    @objid ("64f4a518-b560-4b2f-8b35-1b1d8d3b5196")
    public int poids;

    @objid ("28c3b462-3df4-43d4-a578-fbeb60610bca")
    @Override
    public String toString() {
        return "Fuselage [capacite=" + capacite + ", poids=" + poids + "]";
    }

    @objid ("31c6b58f-ca08-436f-a456-c915d60f089b")
    public Fuselage(int capacite, int poids) {
        super();
        this.capacite = capacite;
        this.poids = poids;
    }

}
