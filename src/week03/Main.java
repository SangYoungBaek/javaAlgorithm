package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성, 인스턴스화

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = "+speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = "+lights);

        System.out.println();
        // 초기값은 null 이지만 gasPedal로 gear를 D로 변경해줬기 때문에
        // D로 출력된다.
        System.out.println("car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100,80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
