package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine(); // 빈 문자가 들어감

            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("나이를 입력하세요: ");
            int age = scanner.nextInt(); // 10 \ n
            scanner.nextLine(); // \ n

            System.out.println("입력한 이름: " + name + "나이: " + age);
        }
    }
}
