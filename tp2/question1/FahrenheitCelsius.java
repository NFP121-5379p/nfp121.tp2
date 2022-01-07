package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
        double r=0; 
        int i=0;
        for(i=0;i<args.length;i++){
            celsius = 0;
            r=0; 
            fahrenheit= Integer.parseInt(args[i]);
            celsius= fahrenheitEnCelsius(fahrenheit);
            fahrenheit=0;
            r = ((int)celsius*10)/10.0;
            System.out.println(args[i] + "\u00B0F -> " +r + "\u00B0C"); 
        }
        // ligne,
                                                                                // format
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
         float c;
        // double r;
         c =  (f -32) / (float)1.8 ;
         //r = ((int)c*10)/10.0 ;    
        return c; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
