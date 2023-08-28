package week03;

//  우리가 클래스를 만들기 위해서는 4가지 STEP 이 필요
//
//  1. 만들려고 하는 설계도를 선언한다.(클래스 선언)
//  2. 객체가 가지고 있어야할 속성(필드)을 정의한다.
//  3. 객체를 생성하는 방식을 정의한다.(생성자)
//      - constructor
//  4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.

public class Car { // 1. 클래스 선언
    // 2. 필드를 정의
    // <필드영역>

    // 1) 고유 데이터 영역
    String company;
    String model ="Gv80";
    String color;
    double price;

    // 2) 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    // 3) 객체 데이터 영역

    Tire tire = new Tire(); // => 인스턴스화
    Door door;
    Handle handle;

    // 3. 생성자 선언
    // : 처음 객체가 생성될 때(instance) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    // <생성자영역>
    public Car () {
        // logic
        // 기본생성자 : 생략 가능
    }

    // 4. 메서드 정의
    // <메서드영역>

    //gasPedal
    //input : kmh
    //output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    //brakePedal
    //input : x
    //output : speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear(char type)
    //output : gear
    char changeGear (char type) {
        gear = type;
        return gear;
    }

    //onOffLight
    //input : x
    //output : lights(boolean)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    //horn
    //input : x
    //output : x
    void horn () {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for(double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
