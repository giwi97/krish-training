
public class Singleton {

	//Creating a instance of Singleton class
	private static Singleton instance;
	
	//private constructor
	private Singleton() {
		
	}
	
	//get the instance
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
		
	}

}
