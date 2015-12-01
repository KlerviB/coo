import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c2ea98fe-884b-47ac-82b0-17f7c1c1e013")
public class Reacteur {
    @objid ("7a66e38d-b2a7-463b-a364-b35fd5058ee1")
    public String marque;

    @objid ("110ae6b3-4416-48f2-917e-827d419d642b")
    public int poids;

    @objid ("b5777a8c-d261-4ef6-a297-98fc3fd2aedb")
    public int poussee;

    @objid ("a1056f14-baaa-4504-ad38-c0e90e63c262")
    @Override
    public String toString() {
        return "Reacteur [marque=" + marque + ", poids=" + poids + ", poussee="
                + poussee + "]";
    }

    @objid ("80b10ee1-3a8e-4eab-b22d-9b3af7fad319")
    public Reacteur(String marque, int poids, int poussee) {
        super();
        this.marque = marque;
        this.poids = poids;
        this.poussee = poussee;
    }


}
