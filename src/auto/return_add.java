package auto;

public class return_add {

	public static void main(String[] args) {
		return_add addition = new return_add();
		
		int result = addition.add();
		System.out.println(result);
		

	}
	public int add()
	{
		int x = 200;
		int y = 200;
		int z = x + y;
		
		return z;
	}

}
