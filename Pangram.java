package FourthAssignment;

public class Pangram {
	public static boolean isPangram(String str) {
		if(str.length()<26) {
			return false;
		}
		else {
			for(char ch='a'; ch<='z'; ch++) {
				if(str.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str=" sal";
		
		if(isPangram(str.toLowerCase())) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not a Pangram");
		}
	}

}
