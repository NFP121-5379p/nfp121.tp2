package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
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
                                                                                // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
         float c;
        // double r;
         c =  (f -32) / (float)1.8 ;
         //r = ((int)c*10)/10.0 ;    
        return c; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
    }

}
