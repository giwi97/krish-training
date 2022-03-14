
public class SuiteFactory {

	   public Suite getSuite(String suiteType){
		   
		      if(suiteType == null){
		    	  
		         return null;
		         
		      }		
		      if(suiteType.equalsIgnoreCase("Specialty")){
		    	  
		         return new Specialty();
		         
		      } else if(suiteType.equalsIgnoreCase("Executive")){
		    	  
		         return new Executive();
		         
		      } else if(suiteType.equalsIgnoreCase("Presidential")){
		    	  
		         return new Presidential();
		         
		      }
		      
		      return null;
		   }
	
}
