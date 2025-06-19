package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProduct = 10;
        String[] prouductNames = new String[maxProduct];
        int[] prouductPrice = new int[maxProduct];
        int prouductCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (prouductCount >= maxProduct) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                    System.out.println("상품 이름을 입력하세요: ");
                    prouductNames[prouductCount] = scanner.next();

                    System.out.println("상품 가격을 입력하세요: ");
                    prouductPrice[prouductCount] = scanner.nextInt();

                    prouductCount++;
            } else if (menu == 2) {
                if (prouductCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < prouductCount; i++) {
                    System.out.println(prouductNames[i] + ": " + prouductPrice[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택했습니다.");
            }
        }
    }
}