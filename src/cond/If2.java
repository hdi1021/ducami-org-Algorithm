package cond;

public class If2 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) { // true
            System.out.println("성인입니다.");
        } else { // if의 조건에 만족하지 않을 때 else가 작동
            System.out.println("미성년자입니다.");
        }
    }
}
