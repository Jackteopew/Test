
public interface Vehicle {
	
	final int gears=5;
	void Changegear(int a);
	void Speedup(int a);
	void slowDown(int a);
	default void out() {
		System.out.println("default");
	}
  static int math(int b) {
	  
	  return b +9;
  }
}
