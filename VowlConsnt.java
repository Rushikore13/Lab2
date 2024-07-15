package demo.ptpl;
import java.util.Scanner;
public class VowlConsnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Word:");
		String s =sc.next();
        
        
        int vowels = 0;
        int consonants = 0;
        	       
        for (int i = 0; i < s.length(); i++) {
            char chara = s.charAt(i);
            
            if (chara == 'a' || chara == 'e' || chara == 'i' || chara == 'o' || chara == 'u') {
                vowels++;
            } else if (chara >= 'a' && chara <= 'z') {
                consonants++;
            }
            sc.close();
        }
        
        System.out.println("Vowels = " + vowels + "; Consonants = " + consonants);

	}

}
