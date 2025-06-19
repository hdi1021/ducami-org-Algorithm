package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁원할 성과");
                break;
            case "B":
                System.out.println("준수함");
                break;
            case "C":
                System.out.println("향상 필요");
                break;
            case "D":
                System.out.println("불합격");
                break;
            case "E":
                System.out.println("병신");
        }
    }
}
