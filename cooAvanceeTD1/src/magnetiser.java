import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b0f3194e-dff3-4de9-8bb5-b7be448aa88c")
public class magnetiser implements Manipuler {
    @objid ("125c35e7-de1a-4e3f-b729-3a6bee9c8fce")
    public void saisir() {
    	System.out.println("Je magnétise");
    }

    @objid ("96dd30f6-b92f-461f-84bb-248662e1d600")
    public void pincer() {
    	
    }

    @objid ("49ad5dd8-86fe-4df3-86c2-254dd8030666")
    public void relacher() {
    	System.out.println("Je demagnétise");
    	
    }

}
