import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> intList = new ArrayList<>();

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

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