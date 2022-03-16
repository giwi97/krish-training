
public class EightCylinderBuilder extends CarBuilder {

	public Car buildCar() {
	
		car = new EightCylinderCar();
		return car;
		
	}
	
	public Engine buildEngine() {
		
		engine = new EightCylinderEngine();
		return engine;
		
	}
	
	public Drivetrain buildDrivetrain() {
		
		drivetrain = new AllWheelDrivetrain();
		return drivetrain;
		
	}
	
	public Chassi buildChassi() {
		
		chassi = new seamWeldedChassi();
		return chassi;
		
	}
	

}
