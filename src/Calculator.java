import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    List<Integer> intList = new ArrayList<>();
    public int calculator(int num1, int num2, char ch) {

        int result = 0;

        try {
            switch (ch) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                default -> throw new ccException();
            }
            intList.add(result);

        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(ccException e) {
            System.out.println("사칙연산이 아닙니다.");
        }
        return result;
    }
}