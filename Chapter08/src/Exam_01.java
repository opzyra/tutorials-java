/*
 * 예외처리
 * 개발자가 예측할수 있는 범위에서 에러/예외를 핸들링할 수 있으면 버그 없는 좋은 프로그램이 될수 있다!
 * 하지만 사용자는 짱구처럼 변칙적이고 행동을 예측할수 없다.
 * 
 * 에러의 종류
 * 컴파일 에러 - 컴파일시 발생하는 에러
 * => 자바의 자료형이 잘못되었던가 선언하지 않은 변수를 사용하거나.. 등
 * 
 * 런타임 에러 - 실행시 발생하는 에러
 * => 0으로 나누거나, 파싱의 자료형이 잘못되었거나.. 등
 * 
 * 논리적 에러 - 실행은 되지만 의도와 다르게 동작하는것
 * => 통장 잔고가 음수된다..
 * 
 * 에러: 프로그램이 종료될 정도로 심각한 오류 (메모리부족, 무한루프 등)
 * 예외: 충분히 예측가능하고 개발자가 컨트롤 할수 있는 오류
 * 
 * 예외 클래스의 구조
 * Error: 에러 클래스
 * Exception: 모든 예외 클래스의 부모 -> 사용자의 실수로 인한 외적요인에 의해 발생하는 예외
 * RuntimeException: 런타임 예외 클래스의 부모 -> 상황으로 발생하는 예외
 * 
 * try ~ catch 구문
 * 예외가 발생할것 같은 부분에 미리 감싸 예외 상황을 핸들링 한다.
 * 
 * try {
 * 	예외가 발생할것 같은 코드 구문;
 * } catch(특정_예외_클래스 예외_인스턴스) {
 * 	예외가 발생했을시 처리할 코드;
 * }
 * 
 * 예외가 발생하면 catch라인으로 넘어가며 그외 try라인은 실행되지 않는다!
 * 
 * 예외 처리 관련 예약어
 * - throw: 예외를 던지다
 * - throws: 예외를 전가
 * - try ~ catch ~ finally: 예외처리 구문
 * 
 * */
public class Exam_01 {

}
