
public class Client {

	public static void main(String[] args) {

		SuiteFactory suitefactory = new SuiteFactory();
		
		Suite suite1 = suitefactory.getSuite("Executive");
		
		Suite suite2 = suitefactory.getSuite("Specialty");
		
		Suite suite3 = suitefactory.getSuite("Presidential");
		
		suite1.getRates();
		
		suite2.getRates();
		
		suite3.getRates();

	}

}
