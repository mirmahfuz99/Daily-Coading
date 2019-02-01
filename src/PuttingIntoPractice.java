
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.*;

public class PuttingIntoPractice {

	public static void main(String[] args) {
		
		Trader mir = new Trader("Md. Mahfuz","Dhaka");
		Trader mahfuz = new Trader("Mir","Cambridge");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(mahfuz, 2011, 710),	
            new Transaction(mahfuz, 2012, 710),	
            new Transaction(mir,   2015, 1000),
            new Transaction(mir,   2015, 1000)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> tr2011 = transactions.stream()
        		//pass a predicate to filter to select transaction from 2011
        		                               .filter(transaction -> transaction.getYear() == 2011)
        		                               .sorted(comparing(Transaction:: getValue))
        		                               .collect(toList());
        System.out.println(tr2011);
        
        //What are all the unique cities where the traders work ?
        List<String> trCity = transactions.stream()
        		//extract all city from Trader associated with transaction
        		                               .map(transaction -> transaction.getTrader().getCity())
        		                               //select only unique city
        		                               .distinct()
        		                               .collect(toList());
        
        System.out.println(trCity);
        
     // Query 3: Find all traders from Dhaka and sort them by name.
        List<Trader> traders = transactions.stream()
        		                           .map(Transaction::getTrader)
        		                           .filter(trader -> trader.getCity().equals("Dhaka"))
        		                           .distinct()
        		                           .sorted(comparing(Trader::getName))
        		                           .collect(toList());
        System.out.println(traders);
       
        
        //Return a String of all traders name sorted by alphabetically 
        String tradersName = transactions.stream()
        		                               .map(transaction -> transaction.getTrader().getName())
        		                               .distinct()
        		                               .sorted()
       //Combine each name one by one to form a String that concatenates all the names 		                               
        		                               .reduce("",(n1,n2) -> n1 +"" + n2);
        
        System.out.println(tradersName);
        
        
        
        

	}

}
