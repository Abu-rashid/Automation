package auto;

import com.sun.jdi.Value;

public class condition {

	public static void main(String[] args) {
		
		condition state = new condition();
		state.city("New jersy");
	}
		public void city(String state)
		{
		
		
		if(state == "Los Anglos")
		{
			System.out.println("California");
		}
		
	
		else if  (state =="Irving")
		{
			System.out.println("TX");
		}
		
		
		
		else if(state == "Dallas")
		{
			System.out.println("TX");
		
		}
		
		else if (state == "New jersy")
		{
			System.out.println("New York");
		}
		else 
		{
			System.out.println("No city");
		}
		
		
	}
	
}
