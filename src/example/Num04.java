package example;

import java.util.LinkedList;

public class Num04 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer += i;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Num04 a = new Num04();
        int num = 12;
        int ab = (int)a.solution(num);

        System.out.println(ab);
    }
}
