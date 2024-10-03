import java.util.*;

public class Main{
	
public static void main(String[] args){
		
		
		System.out.println("Please type your name: ");
		Scanner scanner1 = new Scanner(System.in);
		String name = scanner1.nextLine();
		System.out.println("Hello, " + name);
		System.out.println("Please type your age: ");
		int age = scanner1.nextInt();
		System.out.println("You are " + age + " years old");
		int retirementAge = 67;
		int timeUntilRetirement = retirementAge - age;
		System.out.println("You have " + timeUntilRetirement + " years until retirement");




		
		
	}
	
	
	
	
}