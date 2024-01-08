package careerthon;

import java.util.Arrays;

public class OneDays02 {
    //문자열 내림차순으로 배치하기
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        answer = new StringBuilder(new String(charArr)).reverse().toString();
        return answer;
    }
}
