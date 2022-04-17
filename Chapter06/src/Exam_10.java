/*
 * 은행 계좌를 관리할 목적으로 Account 클래스를 구현하시오.
 * */

class Account{
	// 맴버 필드
	int id; // 계좌번호
	String name; //고객이름
	int balance; // 예금잔액
	
	// 생성자 메서드
	
	//멤버 메서드
	public void init(int no, String irum, int money){
		id = no;
		name = irum;
		balance = money;
	}
	
	public void input(int money){
		balance +=  money;
	}
	
	public int output(int money){
		//잔액 확인
		if(balance < money){
			return 0; // 잔액이 부족한 상태
		}else{
			balance -= money;
			return money;
		}
	}
	
	public void showAccount(){
		System.out.println("계좌번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("예금잔액 : " + balance);
	}
	
}

public class Exam_10 {
	public static void main(String[] ar){
		Account acc1 = new Account();
		
		acc1.init(1, "홍길동", 10000);
		acc1.showAccount();
		System.out.println();
		acc1.input(500);
		if(acc1.output(100000) == 0){
			System.out.println("예금잔액이 부족합니다.");
		}
		acc1.showAccount();
	}
}
