package FourthAssignment;

import java.util.Arrays;

public class RemoveDuplicate {
	static void removeDuplicate(char[] ch, int n) {
		int index=0;
		
		for(int i=0; i<n; i++) {
			int j;
			for( j=0; j<i; j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
	}
	public static void main(String[] args) {
		String str="salam";
		char[] ch=str.toCharArray();
		int n=ch.length;
		removeDuplicate(ch,n);
	}

}
