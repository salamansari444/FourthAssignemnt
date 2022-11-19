package FourthAssignment;

import java.util.Arrays;


public class PrintDuplicate {
	
	static void printDuplicate(char[] ch, int n) {
		int count=1;
		for(int i=0; i<n; i++) {
			int j;
			for( j=i+1; i<n; j++) {
				if(ch[i]==ch[j]) {
					count++;	
					ch[j]=0;
				}
			}
			if(count>1 ) {
				System.out.println(ch[i]);
			}
			
		}
	}
		

	
public static void main(String[] args) {
	

	String str="salam";
	char[] ch=str.toCharArray();
	int n=ch.length;
	printDuplicate(ch,n);
}
}
