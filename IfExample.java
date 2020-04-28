
public class IfExample {
    public static void main(String[] args) {
        int score = 80;
        // score

        if (score >= 90) {
            System.out.println("점수가 90보다 이상입니다.");
            if (score >= 95) {
                System.out.println("A+ 입니다.");
            } else {
                System.out.println("A 입니다.");
            }
        }

        else if (score >= 80) {
            System.out.println("점수가 90점 미만입니다.");
            if (score >= 85) {
                System.out.println("등급은 B+ 입니다.");
            } else {
                System.out.println("B 입니다.");
            }

        } else {
            System.out.println("점수가 80점 미만입니다.");
        }
    }

}
