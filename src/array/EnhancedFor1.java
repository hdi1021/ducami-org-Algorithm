package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        for (int number : numbers) { // :의 오른쪽에 number와 같이 탐색할 배열을 선택함 numbers를 number에 담고 for문을 수행
            System.out.println(number); // iter을 사용 하면 위에 for (int number : numbers)가 자동으로 만들어짐
        }
         // for-each 문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number uu" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
