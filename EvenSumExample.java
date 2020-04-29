
public class EvenSumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=20; i++) {
            // 2 또는 3의 배수를 출력하세요.  조건합:  조건A  || 조건B
             if ((i % 2==0) || (i % 3 ==0)) {
                 System.out.println("2 또는 3의 배수: " + i);
             }
             //2와 3의 공통배수.
            
            System.out.println("2 그리고 또는 3의 배수: " + i);
        
            
            
            
            if ((i % 2 == 0) && (i % 3 ==0)) {
                System.out.println("2 그리고 또는 3의 배수: " + i);
            }
            // if (!(i % 2 == 0)) {
            //     System.out.println("홀수값: " + i);   
            // }
          
            
        
       
    
