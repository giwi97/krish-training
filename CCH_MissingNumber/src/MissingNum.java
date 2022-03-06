import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNum {

	//sort the list
	static void sortList(List<Integer> numbers) {
		
		for(int i = 0;i < numbers.size() - 1;i++) {
			
			for(int j = 0;j < numbers.size() - i - 1;j++) {
				
				if(numbers.get(j) > numbers.get(j + 1)) {
					
					int temp = numbers.get(j);
					numbers.set(j, numbers.get(j + 1));
					//numbers.remove(j + 1);
					numbers.set(j + 1, temp);
					
				}
				
			}
			
		}
		
	}
	//checking missing value
	static void checkMissing(List<Integer> numbers) {
		

		int size = numbers.size();
		
		
		for(int i = 0;i < size;i++) {
			
			if(numbers.get(i) + size - i == numbers.get(size - 1)) {
				
				
				
			}else {
				
				if(numbers.get(i) + size - i - 1 == numbers.get(size - 1)) {
					//if the list is already in (n+1) sequence
					if(i == 0) {
						
						System.out.println("There is no missing value..");
						System.exit(0);
						
					}
					
					int ans = numbers.get(i - 1) + 1;
					
					System.out.println("Missing number is :"+ans);
					System.exit(0);
					
				}else {
					
					System.out.println("Incorrect Sequence!!");
					System.exit(0);
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Enter sequence of numbers separating with spaces :");

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        String sequence[] = sc.nextLine().split(" ");
        
        for (int i = 0;i < sequence.length;i++){

            numbers.add(Integer.parseInt(sequence[i]));
            
        }

        sc.close();
        sortList(numbers);
        
        checkMissing(numbers);
		
	}

}
