package week02.operator;

public class W06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int val = ++a + b--; // a 는 연산전에 +1, b 는 연산후에 -1

        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 21

        // 11 + 9 가 왜 21이 나오는거죠??
        // 그 이유는
        // a 는 val 연산전에 ++ 가 수행되어서 11로 연산되었지만
        // b 는 val 연산후에 -- 가 수행되어서 기존값이 10으로 연산된 후 -- 가 수행되었습니다.
        // 따라서 연산된 a값인 11과 연산되기전 b값인 10이 더해져서 21이 된겁니다!


        int c = a--; // c 에 a 값 대입 후 a-1  (즉, a=10, c=11)
        int d = ++b; // b 값 +1 후에 d 에 대입 (즉, b=10, d=10)
        val = c-- * ++d; // c 는 연산후에 -1, d 는 연산전에 +1

        System.out.println(a); // 10
        System.out.println(b); // 10
        System.out.println(c); // 11
        System.out.println(d); // 10
        System.out.println(val); // 11 * 11 = 121

        // 11 * 10 이 왜 121이 나오는거죠??
        // 그 이유는
        // c 는 val 연산후에 -- 가 수행되어서 기존값이 11로 연산된 후 -- 가 수행되었지만
        // d 는 val 연산전에 ++ 가 수행되어서 11로 연산되었습니다.
        // 따라서 연산전 a값인 11과 연산된 b값인 11이 곱해져서 121이 된겁니다!
    }
}
