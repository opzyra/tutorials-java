package employee;

public abstract class Employee {
	private String name;
	
	public Employee(){}
	
	public Employee(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void showName(){
		System.out.println("name = " + name);
	}
	
	public abstract void showSalary();
	
	public abstract int getSalary();
	
}
