package example;

import java.time.LocalDate;

public class Num44 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }

    public static void main(String[] args) {
        Num44 a = new Num44();
        System.out.println(a.solution(5, 24));
    }
}
