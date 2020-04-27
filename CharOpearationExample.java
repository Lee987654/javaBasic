
public class CharOpearationExample {
    public static void main(String[] args) {
        int v1 =5;
        int v2 =2;

        int result = v1 / v2; // 2
        double result1 = (double) v1 / v2; // 2.5
        System.out.println(result1);
        
        int sanghun;
        sanghun = minus(v1, v2);
        System.out.println("result: " + sanghun);

        int sanghun2;
        sanghun2 = mult(v1, v2);
        System.out.println("result: " +sanghun2);
    
    } // end of main()

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }    

    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static double divide(int num1, int num2) {
        double result = (double)num1 / num2;
        return result;
    }
    
    public static int mult(int num1, int num2) {
        int result = (int)num1 * num2;
        return result;
}

}