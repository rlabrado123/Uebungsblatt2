package h3;

public class H3_main { 
	public static void main(String[] args) {	
			int max   = 100;
			int wartend = 70;
			int fix = 29;
			boolean istVoll = true;
			 int frei = max - fix;

		     
		     if (frei > 0 && wartend > 0) {
		        
		         int zuweisen = Math.min(frei, wartend);
		         fix += zuweisen;
		         wartend -= zuweisen;
		     }
		     istVoll = (fix == max);

	}
}
