package auto;

public class result {

	public static void main(String[] args) {
		
		result math = new result();
		math.add();		
		math.add2();

	}
	public void add()
	{
		int x = 200;
		int y = 200;
		int z = x+y;
		
		System.out.println("Addition Numbers ="+z);
	}
	public void add2()
	{
		int x = 300;
		int y = 300;
		int z = x + y;
		System.out.println("Addition Numbers = "+ z);
	}

}
