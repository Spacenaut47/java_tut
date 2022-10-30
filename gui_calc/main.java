import javax.swing.JOptionPane;
import java.util.Scanner;
public class main {
	static int sum(int a,int b){
		return a+b;
	}
	static int difference(int a,int b){
		return Math.abs(a-b);
	}
	static int multiply(int a,int b){
		return a*b;
	}
	static int divide(int a,int b){
		return a/b;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"Welcome to the calculator");
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		String m = JOptionPane.showInputDialog("Enter the operation: ");
		int ans = 0;
		if(m.equals("sum")){ // .equals function is used to compare variables in if and else statements
			ans = sum(x,y);
		}else if(m.equals("difference")){
			ans = difference(x,y);
		}else if(m.equals("multiply")){
			ans = multiply(x,y);
		}else if(m.equals("divide")){
			ans = divide(x,y);
		}
		JOptionPane.showMessageDialog(null,"Your answer is: "+ans);
	}
}
