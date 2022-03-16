
public class CarClient {

	public static void main(String[] args) {

		CarDirector cardirector = new CarDirector();
		EightCylinderBuilder eightbuilder = new EightCylinderBuilder();
		FourCylinderBuilder fourbuilder = new FourCylinderBuilder();
		
		Car eightCylinderCar = cardirector.constructCar(eightbuilder);
		
		System.out.println();
		
		Car fourCylinderCar = cardirector.constructCar(fourbuilder);
		
	}

}
