
public class LongExample {
	public static void main(String[] args) {
		long num1 = 100; //
		long num2 = 20L;
		long num3 = 1000000000000L;
		
		int num4 = Integer.MAX_VALUE; // 2147483647
		int num5 = 10;
		num4 = 214748364;
		if ((num4 + num5) <= Integer.MAX_VALUE - num5) {
			int result = num4 + num5;
			System.out.println("result: " + num4);
		} else {
			System.out.println("overflow maxvalue");
		}
		int num6, num7;
		num6 = Integer.MAX_VALUE;
		num7 = 424;
		
		if (num6 <=Integer.MAX_VALUE / num7) {
			System.out.println(num6*num7);
		}	else{
			System.out.println("overflow maxvalue");
	}
}
}