import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3dd98a9a-65fa-4429-b239-c8bedaf6fe49")
public class robot {
    @mdl.prop
    @objid ("a59cd6a2-8c21-4105-ac39-e738b31ab2c0")
    private String JavaProperty;

    @mdl.propgetter
    public String getJavaProperty() {
        // Automatically generated method. Please do not modify this code.
        return this.JavaProperty;
    }

    @mdl.propsetter
    public void setJavaProperty(String value) {
        // Automatically generated method. Please do not modify this code.
        this.JavaProperty = value;
    }

    @mdl.prop
    @objid ("1d13160d-0681-44dc-a7e0-9fda01761ceb")
    private String JavaProperty1;

    @mdl.propgetter
    public String getJavaProperty1() {
        // Automatically generated method. Please do not modify this code.
        return this.JavaProperty1;
    }

    @mdl.propsetter
    public void setJavaProperty1(String value) {
        // Automatically generated method. Please do not modify this code.
        this.JavaProperty1 = value;
    }
    
    private deplacement dep;
    private manipuler man; 
    
    @objid ("f0fc3b5e-9fad-43b0-97c9-c602dc6a9385")
    public List<deplacement> deplacement = new ArrayList<deplacement> ();

    @objid ("e147fa93-6c39-4b84-8f93-add33d025568")
    public casier casier;

    @objid ("f50ecab1-4016-42db-b691-5e55ccc7ed04")
    public List<Manipuler> manipuler = new ArrayList<Manipuler> ();

    @objid ("02ce6390-3003-4115-9498-50377dffddf6")
    public void executerDeplacement() {
    	this.dep.voler();
    }

    @objid ("3f2e130b-4954-4c63-a582-26ac024a96a9")
    public void setDeplacement(d: dep)() {
    	
    }

    @objid ("47f0330e-95e4-4cba-a8db-bdd14757df4c")
    public void setManipuler(m: man() {
    }

    @objid ("73cde64c-720e-4c44-bc4c-c9b2dd9e5282")
    public void executerSaisir() {
    }

    @objid ("9cbda3b2-4411-4128-856a-677c497138fd")
    public void executerRelacher() {
    }

}
