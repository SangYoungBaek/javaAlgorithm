package example;

public class Num30 {
    public int solution(int n) {
        String num = "";
        while (n != 0) {
            num += n%3;
            n /= 3;
        }
        return Integer.parseInt(num, 3);
    }
}
