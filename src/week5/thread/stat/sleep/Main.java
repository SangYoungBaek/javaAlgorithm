package week5.thread.stat.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // (1) 예외처리 필수!
                // - interrupt() 를 만나면 다시 실행되기 때문에
                // - InterruptedException이 발생할 수 있어요
                // (2) 특정 쓰레드 지목 불가
                Thread.sleep(2000); //  TIMED_WAITING( 주어진 시간동안만 기다리는 상태 )
                // 객체.메서드(); 이렇게 보통 호출 그러나 위에선 클래스.메서드(); static 메서드 이기 때문에 특정 쓰레드를 지목할 수 없다.
                //InterruptedException : sleep이 2초동안 멈춘다, 그상태에서 interrupt를 호출하면  sleep이 깨지게되는데
                //                          그때 Exception이 발생하기 때문에 InterruptedException이 캐치해서 다른 로직을 처리해주는 예외처리
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // NEW
        thread.start(); // NEW -> RUNNABLE

        try {
            // 1초가 지나고 나면 runnable 상태로 변하여 다시 실행된다.
            // 특정 스레드를 지목해서 멈추게 하는 것은 불가능
            // Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
            thread.sleep(1000); // Thread.sleep(1000); 이랑 코트가 같음 그래서 노란줄 뜨게 됨
            // 그래서 thread.sleep은 이미가 없다 sleep 자체가 스테틱 클래스 이기 때문에!!
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //sleep(1000) : main
    //task : Thread
}
