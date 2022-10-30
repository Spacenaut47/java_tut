public class main{
	public static void main(String args[]){
		double x = 3.14;
		double y = -10;
		double z= Math.max(x,y); //gives out max of 2 numbers
		System.out.println(z);
		double m= Math.min(x,y); //gives out min of 2 numbers
		System.out.println(m);
		double k= Math.abs(y); // gives the absolute value of a number
		System.out.println(k);
		double l= Math.sqrt(x); //gives out square root of a number
		System.out.println(l);
		double o = Math.round(x); //gives out the rounded value of a number
 		System.out.println(o);
		double q = Math.ceil(x); //always rounds up to the upper limit
		System.out.println(q);
		double r = Math.floor(x); //always rounds up to the lower limit
		System.out.println(r);
	}	
}
