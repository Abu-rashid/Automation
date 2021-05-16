package auto;

public class parameter_Multi {

	public static void main(String[] args) {
		
		parameter_Multi multi = new parameter_Multi();
		multi.add_Multi(200, 20);
		

	}
	public void add_Multi(int x,int y)
	{
		int z = x * y;
		System.out.println(z);
	}

}

