package example;

public class Num26 {
    public boolean solution(String s) {
        int a;
        if(s.length() == 4 || s.length() == 6) {
            try {
                a = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}
