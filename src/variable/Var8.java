package variable;

public class Var8 {
    public static void main(String[] args) {
        // 메모리 저장 공간에 대하여
        // 정수
        byte a = 127; // -128 ~ 127
        short b = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // 그냥 ㅁㅊ놈 (ㅈㄴ 긴거)
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // float는 뒤에 "f"를 붙여야함 (오류가 많이 발생하므로 권장X)
        double d = 10.0; // 실수형은 대부분 이거 쓰기

        String orderDetail;
        // class의 첫 글자는 대문자
        // 변수는 소문자
        // 상수는 모두 대문자 + 언더바 사용
        // 패키지는 모두 소문자
    }
}
