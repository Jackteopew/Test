
public class Outer_Class {
	
	
	
	
		
	
	
	public void Inner() {
		class Inner_Class{
			public void display() {
				System.out.println("This is an inner class");
			}
		}
		Inner_Class inclass = new Inner_Class();
		inclass.display();
	}
}



