package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) { // 무한 루프
            sum += i; // 1 + 2 + 3 + 4 + 5
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++; // 1, 2, 3, 4까지 더해지면 10보다 크는 조건에 맞지 않으므로 합이 10보다 커지기 전까지는 이 코드를 거쳐서 다시 while 문으로 감
        }
    }
}
