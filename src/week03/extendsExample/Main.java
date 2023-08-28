package week03.extendsExample;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        Car car = new Car();
        // car.engine = "Orion"; // 오류 (자식 클래스에 있기 때문에 )
        // car.booster(); // 오류 (자식 클래스에 있기 때문에 )

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine = "Orion";
        sportsCar.booster();

        // 자식 클래스 객체에서 부모 클래스 멤버 사용 -> 자유 자재로 사용 가능하다 !!
        sportsCar.company = "GENESIS";
        // 자식 클래스로 만든 인스턴스는 부모 클래스에 모든 특징들을 물려받았다.
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println();

        sportsCar.horn();
        System.out.println(sportsCar.changeGear('D'));
    }
}
