package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50}; // 배열 생성과 초기화 (int형 배열)

        // 변수 값 사용
        for (int i = 0; i < student.length; i++) { // student 리스트 안에 있는 값들만큼 반복됨
            System.out.println("학생" + (i + 1) + "점수: " + student[i]);
        }
    }
}
