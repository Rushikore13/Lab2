package demo.ptpl;
import java.util.Scanner;
public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        
	        String inputString = sc.nextLine();
	        String reverseString = reverse(inputString);
	   
	        System.out.println("Reverse string: " + reverseString);
	      
	        sc.close();
	    }
	  
	    public static String reverse(String str) {
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse += str.charAt(i);
	        }
	        return reverse;
	}

}
