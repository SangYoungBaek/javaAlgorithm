package week5.thread.multi;

public class Main {
    public static void main(String[] args) {
        //1번
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        //2번
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
        //$$$$$$*******$$$$$**$$$$$$$**************$$$$$$********************$$$$$$$$$$$$$$$$$$
        //$$$$$$$$$$$$$$$$$$$$$$$$$$*********************$$$$$$$$$$$$$$$$$*****$$$$$$$$$$$$$$$*******************************
        // 동시에 실행된다.
    }
}
