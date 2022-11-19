package FourthAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	static boolean isAnagram(char[] ch1, char[] ch2) {
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch2.length; j++) {
				if(ch1[i]==ch2[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=s.next().toLowerCase();
		System.out.println("Enter Second String");
		String s2=s.next().toLowerCase();
		
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		char temp;
		
		// sort String 1
		for(int i=0; i<s1.length(); i++) {
			
			for(int j=i+1; j<s1.length(); j++) {
				if(ch1[i]>ch1[j]) {
					temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
//		System.out.println(ch1);
		
		//Sort String 2
		for(int i=0; i<s2.length(); i++) {
			
			for(int j=i+1; j<s2.length(); j++) {
				if(ch2[i]>ch2[j]) {
					temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}
		
//		System.out.println(ch2);
		
		isAnagram(ch1, ch2);
		if(isAnagram(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else
			System.out.println("not Anagram");
		
		

		
	}
	
}
