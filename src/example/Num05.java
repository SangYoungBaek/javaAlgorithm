package example;

import java.util.regex.Pattern;

public class Num05 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++){
            if(n%i == 1) {
                if(answer == 0){
                    answer = i;
                } else if(answer > i){
                    answer = i;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Num05 a = new Num05();
        int num = 12;
        int ab = (int)a.solution(num);

        System.out.println(ab);
    }
}
