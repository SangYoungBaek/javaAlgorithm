package example;

public class Num13 {
    public int solution(int num) {
        if(num == 1) return 0;

        int answer = 0;
        while(num != 1) {
            answer++;
            if(answer > 500){
                return -1;
            }
            if (num % 2 == 0) {
                num = num / 2;
            } else if(num % 2 == 1){
                num = (num * 3) + 1;
            }
        }
        return answer;
    }
}
