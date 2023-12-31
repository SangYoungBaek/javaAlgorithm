## 프로세스와 쓰레드
- 프로세스 : 운영체제로부터 자원을 할당받는 작업의 단위
- 쓰레드 : 프로세스가 할당받은 자원을 이용하는 실행의 단위

### 프로세스
- 실행중인 프로그램

#### 프로세스 구조
- OS가 프로세스를 할당할때 프로그램 Code와 Data, 메모리영역(스텍, 힙)을 함께 할당
- Code는 Java main 메소드와 같은 코드를 말함
- Data는 초기화된 데이터 저장공간
- Memory(메모리 영역)
  - Stack
  - Heap

### 쓰레드
- 프로세스내에서 일하는 일꾼(코드실행의 흐름)
- 쓰레드는 작업요청이 들어오면 생성된다.
- 자원
  - 쓰레드는 명령처리를 하기 위해 메모리공간을 할당받음

#### Java 쓰레드
- JVM 프로세스 안에서 실행되는 쓰레드
- Java Main 쓰레드부터 실행되며 JVM에 의해 실행됨

## 싱글 쓰레드와 멀티 쓰레드
```java
public class main {
  public static void main(String[] args) {
    //main쓰레드
  }
}
```

### 멀티 쓰레드
- 싱글 쓰레드(main 쓰레드) 반대
-
- 여러개의 쓰레드를 만들어서 작업을 동시다발적으로 처리하게 만드는것 멀티쓰레드

#### 싱글 쓰레드
- 프로세스 안에서 하나의 쓰레드만 실행되는 것
- java에서는 main 메서드만 실행시켰을때 싱글 쓰레드라함
- main 메서드의 쓰레드를 메인 쓰레드 라고 함

#### 멀티 쓰레드
- 프로세스 안에서 여러개의 쓰레드가 실행되는 것
- 메인 쓰레드 외에 다른 작업 쓰레드들을 만들어 사용하는 것 ( 메인쓰레드 안에서 사용 )
- 여러 쓰레드를 쓰기 때문에 성능이 좋아진다.
- 메모리를 공유하기 때문에 자원을 효율적으로 사용가능
- 비동기 처리(응답, 작업 쓰레드를 분리하여 빠르게 응답)
- 단점
  - 동기화 문제 발생
  - 교착 상태 발생가능(서로 점유하고 있는 리소스를 내놓지 않음으로써 서로 작업이 종료되기를 기다리는 상태) -> 데드락

## 데몬 쓰레드
- 보이지 않는 곳에서 실행되는 낮은 우선순위를 가진 쓰레드
- 보조적인 역할을 담당 
- 대표적으로 가비지 컬렉터

## 사용자 쓰레드
- 보이는 곳에서 실행되는 높은 우선순위를 가진 쓰레드
- 메인 쓰레드가 대표적인 예

#### JVM은 쓰레드 작업이 끝나면 데몬 쓰레드도 자동으로 종료시켜 버린다.

### 쓰레드 우선순위, 쓰레드 그룹

#### 우선순위
- JVM에 의해 지정됨
- 최대 우선순위(MAX_PRIORITY) = 10
- 최소 우선순위(MIN_PRIORITY) = 1
- 보통 우선순위(NROM_PROIORITY) = 5
- 기본 값이 보통 우선순위이다.
- 우선순위의 범위는 OS가 아니라 JVM에서 설정한 우선순위
- 간단한 실습에선 차이가 크게 체감되지않는다.

#### 쓰레드 그룹
- 모든 쓰레드들은 반드시 하나의 그룹에 포함되어 있어야함.
- 보통 만드는 쓰레드들이 Main쓰레드그룹에 종속되기 때문에 자동으로 main그룹에 포함된다.
- 별도로 지정안하면 main그룹에 포함춤

## 쓰레드 상태
- sleep(), interrupt() 메서드 사용 -> 쓰레드는 상태를 가진다.
- start()로 실행하면 실행과 대기를 반복하며 run() 메서드를 수행한다.
- currentThread()는 현재 실행중인 쓰레드 객체를 리턴
Enum -> 상수

### 쓰레드 제어
- sleep()
  - 현재 쓰레드를 지정된 시간동안 멈추가 함.

- interrupt()
  - 일시정지 상태인 쓰레드를 싱행대기 상태로 만듬

- join()
  - 지정한 쓰레드가 작업하는 것을 기다리게 하는 메서드 
  - interrupt()를 만나면 멈추기 때문에 InterruptedException으로 캐치해야한다.
  - 시간을 지정하지 않으면 thread가 작업을 끝낼 때까지 main쓰레드가 기다린다.

- yield()
  - 남은 시간을 다음 쓰레드에게 양보하고 쓰레드 자신은 실행대기 상태가 됨

- synchronized()
  - 멀티 쓰레드 환경에서 싱크가 매우 중요하다.
  - 한 쓰레드가 진행중인 작업을 다른 쓰레드가 침범하지 못하도록 막는 것.
  - synchronized 를 사용한 동기화
    - 실행할 메서드, 실행할 코드 묶음 앞에 사용 

- wati(), notify()
  - 둘개는 짝이다. 
  - 침범을 막은 코드(synchronized)를 수행하다가 작업을 더 이상 진행할 상황이 아니면 wati()을 호출
  - 싱크로 진행하던 LOCK을 waiting pool에 넣고 기다린다.
  - 추후에 작업을 다시 진행할 상황이면 notify()로 호출 해서 다시 LOCK을 수행

- Lock, Condition



