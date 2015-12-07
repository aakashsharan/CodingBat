package warmup1;

/* Return true if the given string contains between 1 and 3 'e' chars.

 stringE("Hello") -> true
 stringE("Heelle") -> true
 stringE("Heelele") -> false

 */

public class StringE {
	public static void main(String[] args) {
		System.out.println(stringE("Heelele"));
		System.out.println(stringE("Hello"));
		System.out.println(stringE(""));

	}

	public static boolean stringE(String str) {

		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'e') {
				count += 1;
			}
		}

		if (count >= 1 && count <= 3) {
			return true;
		}
		return false;
	}

}
