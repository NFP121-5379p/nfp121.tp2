package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
      /*  int i;
        int intValue;
        double r;
        float celsius;
       for(i=0;i<args.length;i++){
       try{         
           intValue = Integer.parseInt(args[i]); 
            celsius = 0;
            celsius=fahrenheitEnCelsius(intValue);
            r = ((int)celsius*10)/10.0;
            System.out.println(args[i] + "\u00B0F -> " +r + "\u00B0C"); 
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    }*/
       int i ;
       
       for(i=0;i<args.length;i++){
       
       System.out.println(fahrenheitEnCelsius(args[i]));
     }
    }
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
    /* public static float fahrenheitEnCelsius( int f){
        float c;
         c =  (f -32) / (float)1.8 ;    
        return c;    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }*/
     public static String fahrenheitEnCelsius( String values){
         int  intValue;
         double r;         
       try{         
           intValue = Integer.parseInt(values); 
            float c;
            c =  (intValue -32) / (float)1.8 ; 
            r = ((int)c*10)/10.0;
           // System.out.println(args[i] + "\u00B0F -> " +r + "\u00B0C"); 
           return values+"\u00B0F -> " +r + "\u00B0C";
       }catch(NumberFormatException nfe){
          // System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
          return "error : " + nfe.getMessage() ;
        }
     
    }

}
