
public class FourCylinderBuilder extends CarBuilder {

	public Car buildCar() {
		
		car = new FourCylinderCar();
		return car;
		
	}
	
	public Engine buildEngine() {
		
		engine = new FourCylinderEngine();
		return engine;
		
	}
	
	public Drivetrain buildDrivetrain() {
		
		drivetrain = new FrontWheelDrivetrain();
		return drivetrain;
		
	}
	
	public Chassi buildChassi() {
		
		chassi = new FoamFilledChassi();
		return chassi;
		
	}
	
}
