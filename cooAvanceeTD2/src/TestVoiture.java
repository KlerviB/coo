
public class TestVoiture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// voiture 1
		Voiture voit1= new Ferrari("Fer");
		Freinage frein1=new Abs(voit1);
		Motorisation mot1=new Essence(voit1, 1.5f,2f);
		
		
		
		//voiture 2
		Voiture voit2=new Porsche("Por");
		Freinage frein2= new FreinageMag(voit2);
		Motorisation mot21= new Essence(voit2,2 , 2);
		Motorisation mot22= new Diesel(voit2,2,2);
		
		
		//course
		Course cours1=new Course();
		cours1.inscrireVoitureMotorisee(mot22);
		cours1.inscrireVoitureMotorisee(mot1);
		cours1.simulerCourse(5);
		
	}

}
