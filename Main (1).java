public class Main
{
	public static void main(String[] args) {
		System.out.println("_Using relational operators_")
		boolean a = true;
		boolean b = false;
		System.out.println(a != b);
		//Output is true
		
		int a = 5;
		Integer b = new Integer(5);
		System.out.print(a == b)
		//Integer object being compared to an int
		//Output is true because java unpacks the int out of the Integer bbject
	    
	    int a = 5;
	    double b = 5.0;
	    System.out.print(a == b);
	    //int 5 can be compared to double 5.0
	    //Output is true (int can be compared to double but sometimes NOT vice versa)
	    
	    int a = 5;
	    Double b = new Double(5.0);
	    System.out.print(a == b);
	    //Output is true (Java unpacks the Double object, compares 5.0 to 5)
	    
	    Integer a = new Integer(5);
	    Integer b = new Integer(5);
	    System.out.print(a == b);
	    //Output is false, two obejct are being compared (not the same object)
	    
	    Integer a = new Integer(5);
	    Double b = new Double(5);
	    System.out.print(a == b);
	    //Output is false, cannot compare two different objects
	    
	    System.out.println("Cannot compare two different objects. If one object refers to the same object, then comparable.")
	    System.out.println(">, >=, <=, < cannot be used on these types of object references: c1 = Jim, c2 = Bob");
	    System.out.println("Also cannot do these signs on Strings or binary operators like true > false.")
	    System.out.println("These relational operators have lower precedence than arithmetic operators.")
	}
}
