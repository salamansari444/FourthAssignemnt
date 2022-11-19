package FourthAssignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int vowelsCount=0;
		int specialCharCount=0;
		int consonantCount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=s.next();
		for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' ||
		   str.charAt(i)=='e' || str.charAt(i)=='O' || str.charAt(i)=='o' ||
		   str.charAt(i)=='U' || str.charAt(i)=='u')
		{
			
		vowelsCount++;
		
		}
		else if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' ||
				str.charAt(i)=='$' || str.charAt(i)=='%' || str.charAt(i)=='^' ||
				str.charAt(i)=='&' || str.charAt(i)=='*' ) {
			specialCharCount++;
			
		}
		else {
			consonantCount++;
			
		}
			
		}
		System.out.println("Vowels Count : "+vowelsCount);
		System.out.println("special Character Count : "+specialCharCount);
		System.out.println("Consonant count : "+consonantCount);
	}

}
