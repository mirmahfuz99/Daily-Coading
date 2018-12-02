//You are in charge of the cake for your niece's birthday
//and have decided the cake will have one candle for each 
//year of her total age. When she blows out the candles,
//she’ll only be able to blow out the tallest ones. 
//Your task is to find out how many candles 
//she can successfully blow out.
import java.util.*;
public class Birthday_Cake_Candles {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int tallest = 0;
		int frequency = 0;
		
		for(int i = 0; i<n;i++){
		  int height = in.nextInt();
		  if(height>tallest){
			  tallest = height;
			  frequency = 1;
		  }
		  else if(height == tallest) frequency++;
		}
		System.out.println(frequency);
	}

}
