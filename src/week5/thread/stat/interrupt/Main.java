package week5.thread.stat.interrupt;


// - 쓰레드가 'start()' 된 후 동작하다 'interrupt()'를 만나 실행하면 interrupted 상태가 true가 됩니다.
//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            try {
//                // sleep 도중 interrupt 발생 시, catch!
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread"); // NEW
//        thread.start(); // NEW -> Runnable
//        // 10번째 코드에서 sleep이 실행되다가 interrupt()가 실행되서 실행대기상태로 변경되며 InterruptedException로 캐치된다.
//        thread.interrupt();
//        // interrupt 된 상태인지 알려주는 메서드
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}

// 예외 사항이 무조건 발생해야하나요? => 아님 while문으로 체크하면 된다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // interrupt 상태인지 체크해서 while문을 돌릴 수 있다.
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}