import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        int i = 0;

        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n1 = Integer.parseInt(sc.nextLine());
            System.out.println("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n2 = Integer.parseInt(sc.nextLine());

            System.out.println("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char ch = sc.nextLine().charAt(0);

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (ch) {
                case '+' -> result = n1 + n2;
                case '-' -> result = n1 - n2;
                case '*' -> result = n1 * n2;
                case '/' -> result = n1 / n2;
            }
            System.out.println("결과: " + result);

            intArray[i++] = result;

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if (sc.nextLine().equals("exit")) {
                break;
            }
        }
    }
}