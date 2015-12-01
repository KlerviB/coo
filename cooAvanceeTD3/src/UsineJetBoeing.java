import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c73df728-845c-4c64-923f-8a7a79563e86")
public class UsineJetBoeing extends UsineJet {
    @objid ("0d60eebe-0133-4a9d-9456-88097d82771c")
    public UsineJetBoeing(String ville) {
        super(ville);
        // TODO Auto-generated constructor stub
    }

	@Override
	public Jet fabriquerJet(String modeleJet, String marqueRea) {
		Jet j;Fuselage fu;
		ArrayList<Reacteur> rea=new ArrayList<Reacteur>();
		if(modeleJet.equals("B737"))
			{
			fu= new Fuselage(110,28);
			if (marqueRea.equals("Trent"))
				{
					rea.add(new Trent(7,9));rea.add(new Trent(7,9));
				}
			else
				{
					rea.add(new RollRoyce(4,8));rea.add(new RollRoyce(4,8));
				}
			j=new B737(fu,rea);
			}
		else
		{
			fu= new Fuselage(375,100);
			if (marqueRea.equals("Trent"))
				{
					rea.add(new Trent(22,41));rea.add(new Trent(22,41));rea.add(new Trent(22,41));rea.add(new Trent(22,41));
				}
			else
				{
					rea.add(new RollRoyce(20,38));rea.add(new RollRoyce(20,38));rea.add(new RollRoyce(20,38));rea.add(new RollRoyce(20,38));
				}
			j=new B747(fu,rea);
		}
		return j;
	}

}
