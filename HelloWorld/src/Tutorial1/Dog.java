package Tutorial1;

public class Dog {
	protected static int count =0;
	public  String name;
	private int age;
	
	
	public Dog(String name,int age) {
	this.name=name;
	this.age=age;
	add2();
	Dog.count += 1;
	
	}

	public void speak() {
		System.out.println("\nI am " + this.name +" and I am " + this.age + " years old. ");
	}
	
	public int getAge(){
		return this.age;
	  
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int add2() {
		return this.age + 2;
	}
	public void display2() {
		System.out.println("I am a Dog 2");
	}
	public static void display() {
		System.out.println("I am a Dog");
	}
}
	
