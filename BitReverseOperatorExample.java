
public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;
		int num4 = 1000000000000000000;
		system.out.println(num4);

		syst

		// java2 conflict..

		// java add....

		String returnvalue = toBinaryString(num1);
		System.out.println(returnvalue);

		String returnvalue1 = toBinaryString(num2);
		System.out.println(returnvalue1);

		String returnvalue2 = toBinaryString(num3);
		System.out.println(returnvalue2);
	}

	public static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		while (str.length() < 32) {
			str = "0" + str;

		}
		return str;
	}

}
