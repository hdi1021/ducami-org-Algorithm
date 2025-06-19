package scanner.ex;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격을 입력해주세요 (-1을 하면 종료): ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            int totalPrice = price * quantity;
            System.out.println("총 비용: " + totalPrice);
        }
    }
}
