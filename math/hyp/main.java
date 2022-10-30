import java.util.Scanner;
public class main {
	public static void main(String args[]){
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();sc.nextLine();
		b = sc.nextInt();sc.nextLine();
		c = Math.sqrt(((a*a)+(b*b)));
		System.out.println(c);
		Scanner.close();
	}
}
