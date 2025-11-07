package h1;

public class H1_main {
public static void main(String[] args) {
	double guthaben = -100;
	double monEingang = 200;
	 int rating = -2;            // Beispielwert
     boolean warnhinweis;
     boolean negativ;

     // Prüfen, ob das Guthaben negativ ist
     if (guthaben < 0) {
         negativ = true;
     } else {
         negativ = false;
     }

     // Rating berechnen
     if (guthaben > 0) {
         rating += 3;
     } else if (guthaben == 0) {
         rating += 2;
     } else { // guthaben < 0
         if (Math.abs(monEingang) >= Math.abs(guthaben)) {
             rating += 1;
         } else {
             rating -= 1;
         }
     }

     // Warnhinweis bestimmen
     if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
         warnhinweis = true;
     } else {
         warnhinweis = false;
     }

     // Ausgabe der Ergebnisse
     System.out.println("Guthaben: " + guthaben);
     System.out.println("Monatlicher Eingang: " + monEingang);
     System.out.println("Negativ: " + negativ);
     System.out.println("Rating: " + rating);
     System.out.println("Warnhinweis: " + warnhinweis);
}
}
