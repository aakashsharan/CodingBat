package warmup1;

/*Given a string, return a new string where the first and last chars have been exchanged.

 frontBack("code") -> "eodc"
 frontBack("a") -> "a"
 frontBack("ab") -> "ba"*/

public class FrontBack {
	public static void main(String[] args) {
		System.out.println(frontBack("code"));
		System.out.println("a");
		System.out.println("ab");
		System.out.println("");

	}

	public static String frontBack(String str) {

		if (str == null || str.length() == 1 || str=="") {
			return str;
		}

		else {
			String mid = str.substring(1, str.length() - 1);

			return str.charAt(str.length() - 1) + mid + str.charAt(0);
		}
	}

}
