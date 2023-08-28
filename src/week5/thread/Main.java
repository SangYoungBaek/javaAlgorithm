package week5.thread;

public class Main {
    public static void main(String[] args) {
        //1. 첫번째 방법 -> 상속받는 것
        //TestThread thread = new TestThread();
        //thread.start();
        //2. 두번째 방법 -> Runnable 인터페이스를 구현한 것
        //Runnable run = new TestRunnable();
        //Thread thread = new Thread(run);
        //thread.start();
        //3. 세번째 방법 -> 람다식
        // 전에 두 방법에 했던 run에 썼던 코드를 람다식에센 task안에 써준다.
        // 똑같이 Thread를 생성해주고 그안에 담아준다.
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
