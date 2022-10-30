import java.util.Scanner;
public class main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = sc.nextLine();
		System.out.println("What is your age : ");
		int age = sc.nextInt();
		sc.nextLine(); //Always use after using nextInt
		System.out.println("What is your favourite food ? ");
		String food = sc.nextLine();
		System.out.println(name);
		System.out.println("Your age is " + age);
		System.out.println("Your favourite food is "+food);
	}
}
