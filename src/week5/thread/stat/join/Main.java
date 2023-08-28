package week5.thread.stat.join;

//정해진 시간동안 지정한 쓰레드가 작업하는 것을 기다립니다.
//- 시간을 지정하지 않았을 때는 지정한 쓰레드의 작업이 끝날 때까지 기다립니다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); //NEW

        thread.start(); // NEW -> RUNNABLE

        long start = System.currentTimeMillis();

        try {
            // 시간을 지정하지 않았기 때문에 thread가 작업을 끝낼 때까지 main 쓰레드는 기다리게된다.
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
