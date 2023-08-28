package example;

import java.util.Arrays;

public class Num24 {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        answer = new StringBuilder(new String(charArr)).reverse().toString();
        return answer;
    }
}
