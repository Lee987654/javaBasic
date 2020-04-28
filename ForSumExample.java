
public class ForSumExample {
    public static void main(String[] args) {
        // 1.. 100 까지 합을 구하는 프로그램...
        // 3의 배수만 구하는 프로그램...
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }

        int i = 0;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;

        }
        System.out.println("1 ~" + (i - 1) + "합 : " + sum);
    }
}