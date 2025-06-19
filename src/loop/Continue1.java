package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i = 1, 2, 3, 4
        while (i <= 5) { // 이 코드를 실행하고 아래 조건문과 맞지 않으므로 바로 출력을 한뒤 +1을 한값으로 다시 while 문으로 감
            if (i == 3) { // 3은 조건에 맞으므로 이 코드에서 바로 +1을 하고 continue로 인해 바로 while 문으로 가짐
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
