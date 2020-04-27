
public class CharOpearationExample {
    public static void main(String[] args) {
        int v1 =5;
        int v2 =2;

       
        double sanghun3;
        sanghun3 = divide(v1,v2);
        System.out.println("result: " + sanghun3);
        
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