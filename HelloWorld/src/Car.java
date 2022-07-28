
public class Car implements Vehicle{
	private int gear;
	private int speed = 0;
	public void Changegear(int gear) {this.gear=gear;}
	
	public void Speedup(int change) {this.speed += change;}
	
	public void slowDown(int change) {this.speed-= change;}
	
	public void display() {System.out.println("i am a car going "+this.speed +" and i am in gear "+this.gear);
	out();
	}
   
}
