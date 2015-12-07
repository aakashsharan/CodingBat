package warmup1;

/*Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

 startOz("ozymandias") -> "oz"
 startOz("bzoo") -> "z"
 startOz("oxx") -> "o"*/

public class StartOz {
	public static void main(String[] args) {
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
		System.out.println(startOz(""));

	}

	public static String startOz(String str) {

		if (str.equals("") || str.length() == 0) {
			return "";
		}

		if (str.length() == 1) {
			if (str.charAt(0) == 'o') {
				return "o";
			} else {
				return "";
			}
		}
		if (str.charAt(0) == 'o') {
			if (str.charAt(1) == 'z') {
				return "oz";
			} else {
				return "o";
			}
		} else {
			if (str.charAt(1) == 'z') {
				return "z";
			}
		}
		return "";

	}

}
