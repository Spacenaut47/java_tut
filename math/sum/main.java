import java.util.Scanner;
public class main {
	static int sum(int a,int b){
		return a+b;
	}
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();sc.nextLine();
		b = sc.nextInt();sc.nextLine();
		System.out.println(sum(a,b));
	}
}
