package calculater;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String name;
		int x,y,z;
		System.out.println("Enter add for addition");
		System.out.println("Enter sub for Substraction");
		System.out.println("Enter multi for Multipluction");
		System.out.println("Enter divid for Division");
		Scanner in = new Scanner(System.in);
		
		name = in.next();
		
		switch(name){
		
	
			case"add":
				System.out.println("Enter Two numbers");
				x = in.nextInt();
				y = in.nextInt();
				z = x+y;
				System.out.println("Addition is "+z);
				break;
			case"sub":
				System.out.println("Enter Two numbers");
				x = in.nextInt();
				y = in.nextInt();
				z = x-y;
				System.out.println("substraction is "+z);
				break;
			case"multi":
				System.out.println("Enter Two numbers");
				x = in.nextInt();
				y = in.nextInt();
				z = x*y;
				System.out.println("multiplication is "+z);
				break;
			case"divid":
				System.out.println("Enter Two numbers");
				x = in.nextInt();
				y = in.nextInt();
				z = x/y;
				System.out.println("Division is "+z);
				break;
				
				default:
					System.out.println("Wrong choice");
					
				
				
				
				
		
				
		}
		

	}

}
