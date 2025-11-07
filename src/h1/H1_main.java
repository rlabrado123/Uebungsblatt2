package h1;

public class H1_main {
public static void main(String[] args) {
	double guthaben = -100;
	double monEingang = 200;
	 int rating = -2;            
     boolean warnhinweis = true;
     boolean negativ = true;

     
     if (guthaben < 0) {
         negativ = true;
     } else {
         negativ = false;
     }

    
     if (guthaben > 0) {
         rating += 3;
     } else if (guthaben == 0) {
         rating += 2;
     } else {
         if (monEingang >= Math.abs(guthaben)) {
             rating += 1;
         } else {
             rating -= 1;
         }
     }

     
     if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
         warnhinweis = true;
     } else {
         warnhinweis = false;
     }

   
}
}
