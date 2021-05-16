package auto;

public class parameter_Addition {

	public static void main(String[] args) {
		parameter_Addition addition = new parameter_Addition();
		
		addition.add(200, 200);
	}
	public void add(int x,int y)
	{
		int z = x + y;
		System.out.println(z);
	}

}
