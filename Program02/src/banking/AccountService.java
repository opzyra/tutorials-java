package banking;

import java.io.*;
/*
 * 비즈니스 로직
 * 1.메뉴를 관리하는 메서드
 * 2.계좌개설
 * 3.입금처리
 * 4.출금처리
 * 5.전체고객의 잔액을 출력하는 행위
 * */
public class AccountService {
	//객체배열 생성
	Account[] accList;
	int accNum;
	static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public AccountService(){
		accList = new Account[100];  //100개의 계좌를 등록할 객체배열
		accNum = 0;                  //Account 배열의 수(인덱스) 
	}
	
	//메뉴출력
	public void showMenu(){
		System.out.println("\n==== Banking System ====");
		System.out.println("1.계좌등록");
		System.out.println("2.입금처리");
		System.out.println("3.출금처리");
		System.out.println("4.전체고객 잔액보기");
		System.out.println("5.프로그램 종료");
	}
	
	//계좌등록
	public void addAccount() throws IOException{
		System.out.println("\n==== 계좌개설 ====");
		System.out.print("계좌번호 = ");
		int id = Integer.parseInt(in.readLine());
		System.out.print("고객이름 = ");
		String name = in.readLine();
		System.out.print("예금금액 = ");
		int money = Integer.parseInt(in.readLine());
		
		//입력받은 값들을 이용하여 객체배열에 객체를 생성하여 담는다.
		accList[accNum++] = new Account(id, name, money);
	}
	
	//입금처리
	public void inMoney() throws IOException{
		System.out.println("\n==== 입금처리 ====");
		System.out.print("계좌번호 = ");
		int id = Integer.parseInt(in.readLine());
		
		//입력받은 계좌번호와 객체배열에 저장된 계좌번호와 비교하는 작업
		for(int i = 0; i < accNum; i++){
			if(id == accList[i].getId()){//해당 계좌번호가 존재한다면
				System.out.print("입금금액 = ");
				int money = Integer.parseInt(in.readLine());
				//입력받은 금액을 해당 계좌의 예금잔액에 누적하는 작업을 수행한다.
				accList[i].input(money);
				System.out.print("현재 고객님의 잔액은 " + accList[i].getBalance() + "원입니다.");
				return;
			}
		}
		System.out.println("입력하신 계좌번호는 존재하지 않습니다.");
	}
	
	//출금처리
	public void outMoney() throws IOException{
		System.out.println("\n==== 출금처리 ====");
		System.out.print("계좌번호 = ");
		int id = Integer.parseInt(in.readLine());
		
		//입력받은 계좌번호와 객체배열에 저장된 계좌번호와 비교하는 작업
		for(int i = 0; i < accNum; i++){
			if(id == accList[i].getId()){//해당 계좌번호가 존재한다면
				System.out.print("출금금액 = ");
				int money = Integer.parseInt(in.readLine());
				//입력받은 금액을 해당 계좌의 예금잔액에 누적하는 작업을 수행한다.
				//이때, 계좌의 잔액보다 출금금액이 더 많으면 안된다.
				if(accList[i].output(money) == 0){
				System.out.println("잔액이 부족합니다.");
				System.out.print("현재 고객님의 잔액은 " + accList[i].getBalance() + "원입니다.");
				return;
				}
				System.out.println("현재 고객님의 잔액은 " + accList[i].getBalance() + "원입니다.");
			}
		}
		System.out.println("입력하신 계좌번호는 존재하지 않습니다.");
	}
	
	//전체고객 잔액현황
	public void showAllAccount(){
		System.out.println("\n==== 전체고객 잔액보기====");
		for(int i = 0; i < accNum; i++){
			System.out.println(accList[i]);
		}
			
	}
}
