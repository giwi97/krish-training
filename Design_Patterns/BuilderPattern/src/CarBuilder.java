
public abstract class CarBuilder {

	protected Car car;
	protected Engine engine;
	protected Drivetrain drivetrain;
	protected Chassi chassi;
	
	public abstract Car buildCar();
	public abstract Engine buildEngine();
	public abstract Drivetrain buildDrivetrain();
	public abstract Chassi buildChassi();

}
