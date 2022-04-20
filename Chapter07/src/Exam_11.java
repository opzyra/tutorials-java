/*
 * Interface : 인터페이스
 * 1.interface
 *   -abstract 클래스의 한 종류로 포함 멤버에 제약을 가지는 클래스
 *   -다중 상속이 가능한 유일한 클래스
 *   
 * 2.interface에 포함가능한 멤버
 *   -public static final 멤버필드
 *   -public abstract 멤버 메서드
 *   -public static inner 클래스
 *   -default 맴버 메서드 <- JAVA 8
 *   
 * 3.상속관계
 *   -키워드 : extends와 implements()
 *   -클래스에서 클래스 상속 : extends
 *   -인터페이스에서 인터페이스로 상속 : extends
 *   -인터페이스에서 클래스로 상속 : implements
 *   -클래스에서 인터페이스로 상속은 불가능하다.
 *   
 * */
interface A{}
interface B extends A{}
interface C{}
interface D extends A, C{}
class E{}
class F extends E implements A{}
class G implements A, C{}
//interface H implements E{}

public class Exam_11 {

}
