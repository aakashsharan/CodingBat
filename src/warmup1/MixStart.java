package warmup1;

/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") -> true
mixStart("pix snacks") -> true
mixStart("piz snacks") -> false
*/

public class MixStart {
	public static void main(String[] args) {
		System.out.println(mixStart("mix tape"));
		System.out.println(mixStart("piz snacks"));
		
	}
	
	public static boolean mixStart(String str){
		
		if(str.length()>=3){
		String newString = str.substring(1, 3);
		
		if(newString.equalsIgnoreCase("ix")){
			return true;
		}
		return false;
	}
		return false;
	}

}
