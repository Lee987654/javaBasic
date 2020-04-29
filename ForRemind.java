
public class ForRemind {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            int sum = 0;
        }
       
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;

            }

            System.out.println(" 2의배수: " + i);
        }
        System.out.println(" 2의배수의 합계: " + sum);

    }
}
