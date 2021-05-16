package auto;

public class parameter_myname {

	public static void main(String[] args) {
		 parameter_myname full_name = new  parameter_myname();
		 full_name.my_name("Abubakr"," Abdul"," Rashid");

	}
	public void my_name(String name1,String name2,String name3)
	{
		String name = name1 + name2 + name3;
		System.out.println(name);
	}

}
