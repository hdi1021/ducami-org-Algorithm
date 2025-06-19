package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("출력");
        // 4, 3, 2, 1, 0
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) { // 마지막에 출력할 떄 (여기선 마지막 인덱스가 0이기 때문)
                System.out.print(", ");
            }
        }
    }
}
