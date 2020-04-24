
public class BooleanExample {
	public static void main(String[] args) {
		boolean isTrue = false; // true
		isTrue = true;
		
		int num1, num2;
		num1 = 19;
		num2 = 29;
		byte b1 = 10;
		int num4 = b1;
		b1 = (byte) num4;
		
		isTrue = num1 >= num2;
	
		if (isTrue) {
			System.out.println("**");
		} else {
			System.out.println("##");
		
	}
}
}