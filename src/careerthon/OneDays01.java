package careerthon;

public class OneDays01 {
    //약수의 개수와 덧셈
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        for(int i = left; i <= right; i++){
            cnt = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0) cnt++;
            }
            if(cnt % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
}
