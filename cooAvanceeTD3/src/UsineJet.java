import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("529827ff-ed0b-48a9-8d79-591e45d71f4f")
public abstract class UsineJet {
    @objid ("a42b9cff-81ee-4c2f-aa47-7d260042f3cf")
    public String constructeur;

    @objid ("dd5a80f1-4daa-4a33-ac05-5e7595d74a7e")
    public String ville;

    @objid ("41968ded-7854-4a7c-b390-d4af6b9d1ff7")
    @Override
    public String toString() {
        return "UsineJet [constructeur=" + constructeur + ", ville=" + ville
                + "]";
    }

    @objid ("a5e96cc3-1760-4451-ac97-8c19bf95cb0e")
    public abstract Jet fabriquerJet(String modeleJet, String marqueRea) ;

    @objid ("f003e67d-6398-4bd7-ac45-18507b03b1cb")
    public UsineJet(String constructeur, String ville) {
        super();
        this.constructeur = constructeur;
        this.ville = ville;
    }

    @objid ("992d3c16-133d-4f51-ab73-c339940cc3aa")
    public UsineJet(String ville) {
        super();
        this.ville = ville;
    }

}
