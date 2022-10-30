import javax.swing.JOptionPane;
public class main{
	public static void main(String args[]){
		String name = JOptionPane.showInputDialog("Enter your name"); //joptionpane always return string datatype so we have to convert it to other data types when using them.
		JOptionPane.showMessageDialog(null,"Hello "+name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); //Converts string optionpane to int optionpane
		JOptionPane.showMessageDialog(null,"Your age is "+age);
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"Your height is "+height);
	}
}
