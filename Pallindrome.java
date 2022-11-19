package FourthAssignment;

public class Pallindrome {

	public static void main(String[] args) {
		int[] n= {2,5,5,2};
		int[] res=new int[n.length];
		for(int i=n.length-1; i>=0; i--) {
			res[i]=n[i];
		}
		if(res==n) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not a Pallindrome");
		}
		
	}

}
