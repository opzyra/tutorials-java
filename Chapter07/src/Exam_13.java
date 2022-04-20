/*
 * abstract(추상) : 설계도(디자인)
 * 
 * 1. abstract 클래스
 *  - abstract 메서드를 포함하고 있는 클래스로 다형성 표현으로 사용해야 하낟.
 *  - 객체를 발생시킬 수 없는 것을 제외하면 일반 클래스와 동일하다.
 *  
 * 
 * 2. abstract 메서드
 *   - 메서드의 내용부가 정의되지 않은 형태로 모델(디자인)개념으로 사용되는 메서드
 *   - 반드시 오버라이딩(재정의)되어야 사용할 수 있다.
 * 
 * */
abstract class Calculator {
	public abstract int add(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
}

class MyCalculator extends Calculator {

	@Override
	public int add(int x, int y) {
		return x+ y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y;
	}
	
}

class FriendCalculator extends Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x*x + y*y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x*x - y*y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*x * y*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x*x / y*y;
	}
	
}

public class Exam_13 {
	public static void main(String[] args) {
		Calculator ct = new MyCalculator();
		int x = 10, y=20, result = 0;
		
		result = ct.add(x, y);
		
		System.out.println(x + " + " + y +" = " + result);
		
		ct = new FriendCalculator();
		
		result = ct.add(x, y);
		
		System.out.println(x + " + " + y +" = " + result);
	}
}
