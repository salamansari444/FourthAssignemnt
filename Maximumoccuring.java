package FourthAssignment;

public class Maximumoccuring {
	final static int ASCII_SIZE=256;
	public static char  maxOccur(String str) {
		int[] count=new int[ASCII_SIZE];
		for(int i=0; i<str.length(); i++) {
			count[i]=str.charAt(i);
		}
		int max=-1;
		char result=' ';
		for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
	}

	public static void main(String[] args) {
		String str="salam red";
		System.out.println("Maximum Ocuring Character is: "+maxOccur(str));
	}

}
