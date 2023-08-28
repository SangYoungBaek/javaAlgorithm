package week5.thread.stat.sync;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple(); // eatApple()로 사과를 먹을때, 싱크를 안맞추면 3개가 동시에 돌아가게 때문에 1개 일때 3개의 쓰레드가 실행되서 없는데도 실행된다.!!
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };

        // 3개의 thread를 한꺼번에 만들어서 start를 해버림!!
        // 생성(NEW)과 동시에 start(NEW -> RUNNABLE)
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        synchronized (this) {
            if(storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}