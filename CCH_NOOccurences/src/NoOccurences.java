import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NoOccurences {

	public static void main(String[] args) {

		
		System.out.println("Enter a word :");
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		sc.close();
		
		char[] wdArray = new char[word.length()];
		
		for(int i = 0;i < word.length();i++) {
			
			wdArray[i] = word.toLowerCase().charAt(i);

		}
		
		int tempVal;
		
		for(int i = 0;i < wdArray.length;i++) {
			
			for(int j = 0;j < wdArray.length;j++) {
				
				if(wdArray[i] > wdArray[j]) {
					
					tempVal = wdArray[i];
					wdArray[i] = wdArray[j];
					wdArray[j] = (char) tempVal;
					
				}
				
			}
			
		}
		
		int counter = 0;
		
		Map<String, Integer> letters = new TreeMap<>();
		
		for(int i = 0;i < wdArray.length;i++) {
			
			for(int j = 0;j < wdArray.length;j++) {
				
				if(wdArray[i] == wdArray[j]) {
					
					counter++;
					
				}
				
			}
			
			letters.put(String.valueOf(wdArray[i]), counter);
			counter = 0;
			
		}


		for(String i : letters.keySet()) {
			
			System.out.println("Letter: "+i+" Occurences :"+letters.get(i));
			
		}
		

	}

}
