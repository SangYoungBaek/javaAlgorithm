package week03.inter;

public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        // 자동 형 변환
        // LgTv mrc = new LgTv("LG");  이렇게도 되지만 이렇게 객체생성해버리면
        // 나중에 Samsung으로 변경할때 안된다!
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");
        // 매개변수로서 다형성을 구현할 수 있다.
        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();

        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();

        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}