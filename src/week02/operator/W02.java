package week02.operator;

public class W02 {
    public static void main(String[] args) {
        // 사칙 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        // 덧셈
        c = a + b;
        System.out.println(c); // 30

        // 뺄셈
        c = a - b;
        System.out.println(c); // 10

        // 곱셈
        c = a * b;
        System.out.println(c); // 200

        // 나눗셈 (몫)
        c = a / b;
        System.out.println(c); // 2

        // 나눗셈 (나머지) = 나머지 연산
        c = a % b;
        System.out.println(c); // 0
    }
}
