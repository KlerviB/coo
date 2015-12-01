
public class testFabrique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// test fuselage
		Fuselage fu= new Fuselage(35,120);
		System.out.println(fu);
		// test reacteur
		Reacteur r1= new Trent(27,754);
		Reacteur r2= new RollRoyce(346,965386);
		System.out.println(r1);
		System.out.println(r2);
		// test usineairbus
		UsineJetAirbus usair= new UsineJetAirbus("Paris");
		System.out.println(usair.fabriquerJet("A320", "RollRoyce"));
		System.out.println(usair.fabriquerJet("A320", "Trent"));
		System.out.println(usair.fabriquerJet("A380", "RollRoyce"));
		System.out.println(usair.fabriquerJet("A380", "Trent"));
		
		//test usineboeing
		UsineJetBoeing usbo= new UsineJetBoeing("Paris");
		System.out.println(usbo.fabriquerJet("B737", "RollRoyce"));
		System.out.println(usbo.fabriquerJet("B747", "RollRoyce"));
		System.out.println(usbo.fabriquerJet("B737", "Trent"));
		System.out.println(usbo.fabriquerJet("B747", "Trent"));
	}

}
