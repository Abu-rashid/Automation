package auto;

public class parameter_double {

	public static void main(String[] args) {
		parameter_double doubl = new parameter_double();
		doubl.add_double(100.50, 23.89);
		

	}
	public void add_double(double x,double y)
	{
		double z = x + y;
		System.out.println(z);
	}

}
