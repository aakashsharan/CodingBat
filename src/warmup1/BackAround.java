package warmup1;

/*Given a string, take the last char and return a new string with the last char added at the front and back, 
 *so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") -> "tcatt"
backAround("Hello") -> "oHelloo"
backAround("a") -> "aaa"
*/

public class BackAround {
	public static void main(String[] args) {
		System.out.println(backAround("cat"));
		System.out.println(backAround("Hello"));
		System.out.println(backAround("a"));
		
	}
	
	public static String backAround(String str){
		
		char lastChar = str.charAt(str.length()-1);
		StringBuffer sbuf = new StringBuffer(str);
		sbuf.append(lastChar);
		String newString = sbuf.toString();
		return lastChar + newString;
		
	}

}
