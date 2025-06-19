package loop;

public class while2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 50;
        int endNum = 100;

        // i = 1, endNum = 3
        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }

    }
}
