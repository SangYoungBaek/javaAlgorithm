package example;

import java.util.regex.Pattern;

public class Num06 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for(int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }


    public static void main(String[] args) {
        Num06 a = new Num06();
        int x = 2;
        int y = 5;
        long[] ab = a.solution(x, y);

        System.out.println(ab.toString());
    }
}
