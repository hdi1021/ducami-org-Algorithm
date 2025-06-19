package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 명시적(직접) 형변환
        System.out.println(intValue); // int 형으로 바꾸므로 소수점이 날아감(형변환)
        System.out.println("double value = " + doubleValue);

        int z = (int) 10.5; // 소수는 형변환을 해서 int형 변수에 넣어야함
        System.out.println(z);
    }
}
