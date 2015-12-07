package warmup1;

/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) -> true
nearHundred(90) -> true
nearHundred(89) -> false */

public class NearHundred {
	public static void main(String[] args) {
		System.out.println(nearHundred(93));
		System.out.println(nearHundred(90));
		System.out.println(nearHundred(89));
		System.out.println(nearHundred(121));
		
	}
	
	public static boolean nearHundred(int n){
		int number1 = Math.abs(100-n);
		int number2 = Math.abs(200-n);
		if((number1<=10) || (number2<=10)){
			return true;
		}
		return false;
	}

}
