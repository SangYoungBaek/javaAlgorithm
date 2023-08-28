package example;

import java.util.*;
public class Num03 {

    int solution(int n) {
        int answer = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();

        while (n > 0){
            stack.push(n%10);
            n = n / 10;
        }

        while ((!stack.isEmpty())){
            answer += stack.pop();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }


    public static void main(String[] args) {
        Num03 a = new Num03();
        int num = 987;
        int ab = (int)a.solution(num);

        System.out.println(ab);
    }
}
