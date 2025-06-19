package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        do { // Do-While 문은 무조건 한번은 실행함 (꼭 실행하는 경우에 사용)
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i <3);

    }
}
