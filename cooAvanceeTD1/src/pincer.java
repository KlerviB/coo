import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1f69966c-8f82-4418-a741-7807ed4e51e6")
public class pincer implements Manipuler {
    @objid ("3a42b676-29d3-4bf7-86dc-477fadf7eadb")
    public void saisir() {
    	System.out.println("Je ferme la pince");
    }

    @objid ("508bc6ff-1135-4936-b71a-6638588a3a9c")
    public void pincer() {
    }

    @objid ("e4e1fcd3-f565-45ef-934c-f93f05eb6eba")
    public void relacher() {
    	System.out.println("J'ouvre la pince");
    }

}
