package example;

public class Num29 {
    public static void main(String[] args) {
        Num29 nm = new Num29();
        int a = 3;
        int b = 12;
        int[] result = nm.solution(a, b);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i <= m ; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = n * m / answer[0];

        return answer;
    }
}