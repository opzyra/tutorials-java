package banking;

// 계좌를 관리하기 위한 클래스 Account
public class Account {
	private int id;       //계좌번호
	private String name;  //고객이름
	private int balance;  //예금잔액
	
	public Account(){}
	
	public Account(int id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "Bank[id : " + id + ", name : " + name + ", balance : " + balance +"]";
	}
	
	//입금처리를 위한 메서드
	public void input(int money){
		balance += money;
	}

	//출금처리를 위한 메서드
	public int output(int money){
		if(balance < money)
			return 0;
		else{
			balance -= money;
			return money;
		}
	}
}
