package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] student; // 배열 변수 선언
        student = new int[5]; // new는 새로 생성한다는 뜻이고, int[5]는 int형 변수 5개라는 뜻임
        student = new int[5]; // 배열 다섯 개를 만들 공간 (배열을 나타내는 [] 괄호임)

        // 변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;
        // student[5] = 40; // 메모리 안에 없으므로 에러남 (메모리는 5의 공간까지만 만들었기 때문)

        //
        System.out.println("학생1 점수: " + student[0]);
        System.out.println("학생2 점수: " + student[1]);
        System.out.println("학생3 점수: " + student[2]);
        System.out.println("학생4 점수: " + student[3]);
        System.out.println("학생5 점수: " + student[4]);

    }
}

