package week5.thread;

// 2. 두번째 방법 인터페이스를 활용한 방법
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        // 쓰레드에서 수행할 작업 정의!
        for (int i = 0; i<100; i++){
            System.out.print("$");
        }
    }
}
