package week5.thread.deamon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("demon");
            }
        };

        // 우선순위가 낮다! => 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당받는다.
        Thread thread = new Thread(demon);
        // 중요 쓰레드를 데몬으로 설정하는 코드
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("task");
        }
        // 데몬쓰레드가 10만번 다 안찍혔는데 main 쓰레드 for문이 끝나자 끝나버렸다.
    }
}
