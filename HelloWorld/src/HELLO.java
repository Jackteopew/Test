import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import Tutorial1.Dog;


public class HELLO {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		
		//HASH MAPS 
		Map x= new TreeMap();
		x.put("tim", 421);
		x.put("risshi", 423);
		x.put("brownie", 422);
		System.out.println(x.get("risshi"));
		System.out.println(x);
		
		Map e= new HashMap();
		e.put("tim", 421);
		e.put("risshi", "ass" );
		e.put("brownie", 422);
		System.out.println(e.get("risshi"));
		System.out.println(e);
	    e.containsValue("422");
	   
	    System.out.println( e.containsKey("risshi"));
	    
	    //Problems
	    
	    Map m = new HashMap();
	    String str = "Hi My Name is";
	    
	    for(char z:str.toCharArray())
	    {
	    	if (m.containsKey(z)){
	    		int old = (int)m.get(z);
	    		m.put(z,old+1);
	    	}
	    	else {
	    		m.put(z, 1);
	    	}
	    }
	    m.remove(' ');
	    System.out.println(m);
	    
	    int[]  c = {-99,5,6,3,2,1,7,8,0};
	    Arrays.sort(c,1,7);
	    for(int i:c ) {
	    System.out.print(i+",");
	    } 
	   
	    Dog mati = new Dog("mati",90);
	    mati.speak();
	    mati.display();
		
	    Student eminem = new Student("marshall");
	    Student slim_shady = new Student("marshall");
	    System.out.println(eminem.equals(slim_shady));
	    System.out.println(eminem.compareTo(slim_shady)>0);
	    System.out.println(eminem);
	    
	    Outer_Class outClass = new Outer_Class();
	    outClass.Inner();
	    
	    Car Ford = new Car();
	    Ford.Speedup(45);
	    Ford.Changegear(3);
	    Ford.display();
	    int g = Vehicle.math(9);
	    System.out.println(g);
	    
	    Level lvl = Level.MEDIUM ;
	    Level[] arr= Level.values();
	    for(Level e:arr) {
	    	 System.out.println(e);
	    }
	    String en =lvl.toString();
	    System.out.println(en);
	    System.out.println(lvl.getlvl());
	    System.out.println(Level.valueOf("LOW"));
	    
	    
		
		
    
	}

}
