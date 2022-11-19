package FourthAssignment;

import java.util.Scanner;

public class UniqueCharacters {
	
	 static public boolean unqChar(String str) {
		 for(int i=0; i<str.length(); i++) {
			 for(int j=i+1; j<str.length(); j++) {
				 if(str.charAt(i)==str.charAt(j)) {
					 return false;
				 }
			 }
		 }
		return true;
	} 
	
	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=s.next();
		unqChar(str);
		
		if(unqChar(str)) {
			System.out.println("Strng Contain all Unique Characters");
		}
		else {
			System.out.println("String not Contain Unique Characters");
		}
		
		
	}

}
