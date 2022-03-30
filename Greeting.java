package basic;

public class Greeting {

	public static void main(String[] args) {
	
		String name;
		int time;
		
		time = -1;
		name = "Juma";
		
		if (time>=0 && time<=12)
		System.out.println("Good Morning "+name);
		else if (time>=12 && time<=18)
			System.out.println("Good Afternoon "+name);
		else if (time>=18 && time<=24)
			System.out.println("Good Evening "+name);
		else 
			System.out.println("Wrong Time");
			
				
			
		

	}

}
