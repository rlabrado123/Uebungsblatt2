package h3;

public class H3_main { 
	public static void main(String[] args) {
		
			int max   = 100;
			int wartend = 70;
			int fix = 29;
			boolean istVoll = true;
			 int frei = max - fix;

		     // Wenn noch Fixplätze frei sind und Personen auf der Warteliste stehen:
		     if (frei > 0 && wartend > 0) {
		         // Anzahl der neuen Fixplätze, die vergeben werden können
		         int zuweisen = Math.min(frei, wartend);

		         // Aktualisiere fix und wartend
		         fix += zuweisen;
		         wartend -= zuweisen;
		     }

		     // Setze istVoll entsprechend
		     istVoll = (fix == max);

		System.out.println(max);
		System.out.println(wartend);
		System.out.println(istVoll);
	}
}
