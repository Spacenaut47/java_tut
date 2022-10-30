import java.util.Random;
public class main {
	public static void main(String args[]){
		Random random = new Random();
		int x = random.nextInt();
		int y = random.nextInt(6)+1; //prints number between 0 and 5 so to get 6 we need to add 1 to it.
		double k = random.nextDouble(y);
		boolean m = random.nextBoolean();
		System.out.println(k);
		System.out.println(y);
		System.out.println(x);
		System.out.println(m);
	}
}
