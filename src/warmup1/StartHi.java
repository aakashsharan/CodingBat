package warmup1;

/*Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") -> true
startHi("hi") -> true
startHi("hello hi") -> false*/

public class StartHi {
	public static void main(String[] args) {
		System.out.println(startHi("hi there"));
		System.out.println(startHi("hi "));
		System.out.println(startHi("hello hi"));
		
	}
	
	public static boolean startHi(String str){
/*		String strNew = str.substring(0, 2);
	
		if(strNew.equalsIgnoreCase("Hi")){
			return true;
		}
		return false;*/
		
		if(str.startsWith("hi")){
			return true;
		}
		return false;
	}

}
