package auto;

public class Array_demo {

	public static void main(String[] args) {
		int obj[] = new int[3];
		
		obj[0] = 200;
		 obj[1] = 300;
		 obj[2] = 400;
		
		int x = obj.length;
		
		System.out.println(x);
		
		for(int i =0;i < x;i++) {
			System.out.println(obj[i]);
		}

	}

}
