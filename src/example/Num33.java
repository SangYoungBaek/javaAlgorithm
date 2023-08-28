package example;

public class Num33 {
    public static void main(String[] args) {
        Num33 n33 = new Num33();
        System.out.println(n33.solution("3141592", "271"));
        System.out.println(n33.solution("500220839878", "7"));
        System.out.println(n33.solution("10203", "15"));

    }

    public int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for(int i = 0; i < t.length() - len + 1 ; i++){
            long diff = Long.parseLong(t.substring(i, i + len));
            if(diff <= num) answer++;
        }

        return answer;
    }
}
