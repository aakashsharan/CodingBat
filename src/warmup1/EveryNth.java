package warmup1;

/* Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) -> "Mrce"
everyNth("abcdefg", 2) -> "aceg"
everyNth("abcdefg", 3) -> "adg"

*/

public class EveryNth {
	public static void main(String[] args) {
		System.out.println(everyNth("Miracle", 2));
		
	}
	
	public static String everyNth(String str, int n){
		
		String newString = "";
		
		for(int i=0; i<=str.length()-1; i=i+n){
			newString = newString + str.charAt(i);
			
		}
		return newString;
		
		
	}

}
