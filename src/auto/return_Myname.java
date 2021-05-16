package auto;

public class return_Myname {

	public static void main(String[] args) {
		return_Myname full_name = new return_Myname();
		
		String result = full_name.name();
		System.out.println(result);
	}
	public String name()
	{
		String a = "Abubakr";
		String b = " Abdul Rashid";
		String  c = a + b;
		return c;
		
	}

}
