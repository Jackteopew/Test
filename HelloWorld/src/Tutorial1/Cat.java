package Tutorial1;


public class Cat extends Dog{
	private int food;
	public Cat(String name,int age,int food) {
		super(name,age);
		this.food=food;
	}
	
public Cat(String name,int age) {
	
	super(name,age);
}
	
	public void speak() {
		System.out.println("Meow ma name is " + this.name +" and I get fed " + this.food);
	}
 public void eat(int f) {
	
	 this.food -= f;
	 System.out.println(this.food);
 }
}
