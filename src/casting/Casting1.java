package casting;

public class Casting1 {
    public static void main(String[] args) { // 형변환은 작은 범위 타입에서 큰 범위 타입으로 대입하는건 가능하다
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue; // int -> long
        System.out.println("longvalue: " + longValue);

        doubleValue = (double) intValue; // int -> double
        System.out.println("doublevalue: " + doubleValue);

        doubleValue = (double) 20L; // long -> double // 자바가 이런식으로 자동 형변환을 해줌

        System.out.println("doublevalue2: " + doubleValue);
    }
}
