import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);

            int result = 0;

            result = cal.calculator(n1, n2, ch);
            intList = cal.getIntList();

            System.out.println("결과: " + result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.nextLine().equals("remove")) {
                intList.remove(0);
                cal.setIntList(intList);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.nextLine().equals("inquiry"));
            for (Integer i : cal.getIntList()) {
                System.out.println("결과: " + i);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit")) {
                break;
            }
        }
    }
}