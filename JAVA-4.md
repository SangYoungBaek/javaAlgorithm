### 4강
오류 및 예외처리
컴파일 에러(예외) : 문법오류
런타임 에러(예외) : 프로그램 돌아가다가 발생한 오류
    - Checked Exception
    - 예외 처리를 해놓지 않으면 발생하는 에러 컴파일 에러 -> 어떻게 예외처리를 할것이냐 배움.

키워드!
- 정의, 알림, 핸들링
- try ~ catch ~ finally,throwsㅊ 
- throws : 던지다!!(=예외를 던지다 / 발생시키다.)

try ~ catch ~ finally 

Checked Exception
인지 -> 정의 -> throws, thorw -> 메서드 사용(Main)

Checked Exception
-> 우리가 사전에 알고 있어서 예외처리를 사전에 할 수 있는 예외
-> 예외처리 안하면 컴파일 시 에러남
Unchecked Exception
->런타임 때 발생하기 때문에 예측할 수 업는 에러이다.

Throwable Class
- Error
- Exception

RuntimeException -> 실행중에 발생한 에러
구현된게 없다면 내가 만들어야한다. -> OurBadException.java 처럼

Chained Exception - 연결된 예외
A -> B -> C
해결방법
initCause() : 지정한 예외를 원인 예외로 등록하는 메소드
getCause() : 원인 예외를 반환하는 메소드 

Checkec Exception을 랩핑해서 Unchecked Exception으로 만들 수 있다.

실제 예외 처리 메커니즘
- 예외 복구
- 예외처리 회피
- 예외 전환

### 제네릭
- 자바스크립트랑, 파이썬은 매개변수를 어떤걸 넣어도 문제가 안된다.
- 자바는 타입에 맞는 매개변수만 넣어야한다.
- <> 사이에 있는 변수명T = 타입변수
- Generic 클래스 = 원시타입

#### 제한
- static 멤버에 사용 X
- 타입변수는 인스턴스 변수로 간주
- 제네릭 배열 X
#### 문법
- 다수의 타입변수 사용가능
- 상속과 타입의 관계는 그대로 적용
- 와일드 카드
```java
// 다형성
<? extends T> // T와 그 자손들만 사용 가능 
<? super T> // T와 그 조상들만 가능
<?> // 제한없음
```
- 제네릭 메소드의 타입변수와 클래스의 타입변수가 이름이 같더라도 다른 변수이다!!

책추천
- Think Data Structures
### Collection 
#### List
- 추상적 자료구조 -> 순서있고 일렬로 나열한 원소들 모임
- 순서 있고 중복 허용 <> 집합(Set)과 구별
- 검색에는 유리하고 수정/삭제는 불리한 자료구조

List -> ArrayList 로 상속되서 안에 구현되어 있다.


### Wrapper 클래스
- 원시 타입을 '추상화' 시켰다.
- 추상적인 기능이 필요할때에만 사용한다.
```java
 Integer num = new Integer(17);  // Boxing
int n = num.intValue(); // UnBoxing

Character ch = 'X'; // AutoBoxing
char c = ch; // AutoUnBoxing
```


















