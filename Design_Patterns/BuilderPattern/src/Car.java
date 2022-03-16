
public abstract class Car {

	protected Engine engine;
	protected Drivetrain drivetrain;
	protected Chassi chassi;

	public abstract String getRepresentation();

	public void setEngine(Engine engine) {
		
		this.engine = engine;
		
	}

	public Engine getEngine() {
		
		return engine;
		
	}
	
	public void setDrivetrain(Drivetrain drivetrain) {
		
		this.drivetrain = drivetrain;
		
	}
	
	public Drivetrain getDrivetrain() {
		
		return drivetrain;
		
	}
	
	public void setChassi(Chassi chassi) {
		
		this.chassi = chassi;
		
	}
	
	public Chassi getChassi() {
		
		return chassi;
		
	}

}
