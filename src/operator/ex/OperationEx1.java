package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3; // int 끼리의 나누기는 결과가 정수형으로 나옴

        System.out.println(sum);
        System.out.println(average);
    }
}
