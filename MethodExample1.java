
public class MethodExample1 {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printStar(int str, String name) {
        for (int i = 1; i <= str; i++)
            System.out.println(name);

    }

    public static void printString(String str, String name) {
        System.out.println(str + "," + name);
    }

    public static void printDouble(int a, String str) {
        for (int i = i; i <= a; i++) {
            System.out.println("*****");

        }
    }

    public static void printDouble(int a, int b) {
        int num = (a / b);
        System.out.println(num);
    }

    public static void printGugudan(int k) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(k + " * " + j + " = " + (k * j));

        }

    }

    public static void printTriangle(int l) {
        for (int j = 1; j <= l; j++) {
            for (int z = 1; z <= l; z++) {
                if (j >= z) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }

    }
}
