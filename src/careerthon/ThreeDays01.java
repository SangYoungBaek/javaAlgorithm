package careerthon;

import java.util.Scanner;

public class ThreeDays01 {
    //직사각형 별찍기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String line = "*".repeat(a) + "\n";
        String answer = line.repeat(b);

        System.out.println(answer);
    }
}
