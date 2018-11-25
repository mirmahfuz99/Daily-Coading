
public class Reverse_Integer {
	
	public static void main(String[] args) {
	 Reverse_Integer test = new Reverse_Integer();
	 int aa = test.reverse(18);
	 System.out.println(aa);
	}

	  public int reverse(int x) {
	        int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;  
	            System.out.println("This is Pop" + pop);
	            x /= 10;
	            System.out.println("This is x" + x);
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }
	}


