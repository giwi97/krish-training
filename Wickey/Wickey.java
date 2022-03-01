import java.util.Scanner;

public class Wickey{

	public static void main(String args[]){

		int reqDistance, cycleDist, cycleTime;
		cycleDist = 9; //total distance for 1 cycle 5+3+1
		cycleTime = 6; //total time for 1 cycle 1+2+3

		System.out.println("Enter the distance Wickey needs to jump: ");
		Scanner sc = new Scanner(System.in);

		reqDistance = sc.nextInt();
		sc.close();		

		int noOfCycles = reqDistance / cycleDist; //number of cycles
		int remDistance = reqDistance % cycleDist; //remaining distance after completing full cycle

		int timeForCycle = noOfCycles * cycleTime; //time for full cycle
		int remTime = 0; //time to complete remaining distance

		if(remDistance == 0){

			timeForCycle = timeForCycle - 3; //even if it's full cylce, at the start Wickey doesn't rest

		}

		
		
		if(remDistance <= 5){

			remTime = 0;

		}else if(remDistance > 5 && remDistance <= 8){

			remTime += 1;

		}
		if(remDistance > 8 && remDistance <= 9){

			remTime += 3;

		}

		System.out.println("Total time is :"+(timeForCycle+remTime)+" Seconds");

	}
}