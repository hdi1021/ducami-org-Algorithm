package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 불가능
            System.out.println("if x = " + x);
        } // x 생존 종료
        // System.out.println("if x = " + x); // x의 생존 범위 밖이므로 에러남 (x라는 정수형 변수는 if 문 안에서 정의했기 때문)
        System.out.println("if m = " + m);
    } // m의 생존 종료
}
