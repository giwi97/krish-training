
public class CarDirector {

	public Car constructCar(CarBuilder carbuilder) {
		
		Car car = carbuilder.buildCar();
		System.out.println(car.getRepresentation());
		car.setEngine(carbuilder.buildEngine());
		System.out.println(car.getEngine().getRepresentation());
		car.setDrivetrain(carbuilder.buildDrivetrain());
		System.out.println(car.getDrivetrain().getRepresentation());
		car.setChassi(carbuilder.buildChassi());
		System.out.println(car.getChassi().getRepresentation());
		
		return car;
		
	}
	
}
