import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("83569a36-7c5c-460d-aa2b-824547c215a8")
public class UsineJetAirbus extends UsineJet {
    @objid ("939aa94a-e0b1-4b62-aa7c-dec2eae1f6d3")
    public UsineJetAirbus(String ville) {
        super( ville);
        // TODO Auto-generated constructor stub
    }

	@Override
	public Jet fabriquerJet(String modeleJet, String marqueRea) {
		Jet j;Fuselage fu;
		ArrayList<Reacteur> rea=new ArrayList<Reacteur>();
		if(modeleJet.equals("A320"))
			{
			fu= new Fuselage(120,30);
			if (marqueRea.equals("Trent"))
				{
					rea.add(new Trent(6,9));rea.add(new Trent(6,9));
				}
			else
				{
					rea.add(new RollRoyce(5,10));rea.add(new RollRoyce(5,10));
				}
			j=new A320(fu,rea);
			}
		else
		{
			fu= new Fuselage(110,550);
			if (marqueRea.equals("Trent"))
				{
					rea.add(new Trent(9,13));rea.add(new Trent(6,9));rea.add(new Trent(9,13));rea.add(new Trent(9,13));
				}
			else
				{
					rea.add(new RollRoyce(8,12));rea.add(new RollRoyce(8,12));rea.add(new RollRoyce(8,12));rea.add(new RollRoyce(8,12));
				}
			j=new A380(fu,rea);
		}
		return j;
	}

}
