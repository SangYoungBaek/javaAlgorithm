package example;

import java.util.Scanner;

public class Num28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); // 세로
        // String 선언해주시고, *을 가로번 반복 뒤, 마지막에 \n을 추가로 붙일거에요
        String line = "*".repeat(a) + "\n";
        String answer = line.repeat(b);

        System.out.println(answer);
    }
}
