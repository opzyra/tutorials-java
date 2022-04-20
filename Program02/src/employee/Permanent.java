package employee;

//정규직
//DTO = VO = Model = JAVA Bean


//JAVA Bean
//정보 은닉화를 위해 접근 제어자를 private

public class Permanent extends Employee{
	private int salary;
	
	public Permanent(){ // 생성자 메서드는 생략 가능함..
		
	}
	
	public Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		showName();
		this.salary = salary;
	}
	
	public void showSalary(){
		System.out.println("name : " + super.getName());
		System.out.println("salary : " + salary);
	}
}
