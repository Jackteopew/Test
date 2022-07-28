package Tutorial1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hello_world =  3;
		int num2=2;
		double division=hello_world / (double) num2 ;
		double d= Math.pow(num2, hello_world);
		int q =56 % 5;
		System.out.println(q);
		
		Scanner sc=new Scanner(System.in);
		
		int scanned1= sc.nextInt();
		int x =scanned1;
		System.out.println(x);
	
		String scanned2=sc.next();
		String s=scanned2;
		if(s.equals("Risshi")) {
			System.out.println("YOU TYPED NAME!");
		}
		
		else if(s.equals("20")) {
			System.out.println("YOU are 20");
			}
		
		else {
			System.out.println("Wanna get some pizza?");
			String scanned3 = sc.next();
			String[] possibilities = {("yes"),("no")};
			String z =scanned3;
			if(z.equals(possibilities[1])) {
				System.out.println("THEN GO FUCK A SPIDER THROUGH A WET TUBE YA FACK!!!");
			}
			else {
			System.out.println("PIZZAAA!");
			}
		}
		
		System.out.println("Type  4");
		int f =sc.nextInt();
		int count=0;
		
		while(f != 4) {
			
			System.out.println("TYPE 4");
			f = sc.nextInt();
			count++;
			}
		System.out.println("You typed four after "  +  count + " times." );
		
		Set<Integer> t= new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(-3);
		t.add(9);
		
		int sizet=t.size();
		System.out.println(sizet);
		
		boolean i=t.contains(5);
		System.out.println(i);
		
		ArrayList<Integer>e = new ArrayList<Integer>();
		e.add(1);
		e.add(2);
		e.add(3);
		e.add(4);
		e.add(5);
		e.add(6);
		e.get(0);
		e.set(1, 69);
		
		System.out.println(e);
		System.out.println(e.subList(2,6));
		
		Dog brownie= new Dog ("brownie",4);
		Dog blacky = new Dog ("blacky",9);
		Dog dog = new Dog ("dog",0);
		brownie.speak();
		blacky.speak();
		dog.speak();
		
		int y =brownie.getAge();
		System.out.println(y);
		brownie.setAge(8);
		int p =brownie.getAge();
		System.out.println(p);
	    
		
		Cat atteh = new Cat("atteh",15,500);
		atteh.speak();
		atteh.eat(50);
		
		
		
		
		
}
}