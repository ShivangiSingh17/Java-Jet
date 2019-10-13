// Java program to demonstrate Polymorphism 

// This class will contain 
// 3 methods with same name, 
// yet the program will 
// compile & run successfully 
public class Sum { 

	// Overloaded sum(). 
	// This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). 
	// This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). 
	// This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter number 1");
		String n1 = Integer.parseInt();
		
		System.out.println("Enter number 2");
		String n2 =Double.parseDouble();
		
		System.out.println("Enter number 3");
		String n3 = Double.parseDouble();
		Sum s = new Sum(); 
		System.out.println(s.sum(n1, n2)); 
		System.out.println(s.sum(n1, n2, n3)); 
		System.out.println(s.sum(n2, n3)); 
	} 
} 

