//Given an array of integers, calculate the fractions of its elements that are positive, negative, 
//and are zeros. Print the decimal value of each fraction on a new line.
import java.util.*;
public class Plus_minus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numInputs = scan.nextDouble();
		
		int posInputs = 0;
		int negInputs = 0;
		int zeroInputs = 0;
		
		for(int i= 0;i<numInputs; i++){
			int tmp = scan.nextInt();
			
			if(tmp > 0){
				posInputs++;
			}
			else if(tmp <0 ){
				negInputs++;
			}
			else{
				zeroInputs++;
			}
			
		}
		scan.close();
		//print result:
		System.out.println(posInputs / numInputs);
		System.out.println(negInputs / numInputs);
		System.out.println(zeroInputs / numInputs);
		

	}

}
