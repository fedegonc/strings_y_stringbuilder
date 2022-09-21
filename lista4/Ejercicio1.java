package lista4;


import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        String frase;
        String[] tokens;
       
        while(true)
        {
            
            salida("Ingrese una frase para traducirla a PigLatin o digite exit para salir \n");

            frase = entrada();
            
            
            if(frase.length() > 2){
                tokens = split(frase);
                pigLatin(tokens); 
            }
            else{
                 salida("Ingrese una frase con más de dos caracteres \n");
            }
            
            if(frase.equalsIgnoreCase("exit"))
                break;
            
        }
        

    }
    
    public static void pigLatin(String[] frase) {
        
        for (String palabra : frase) {
            
            StringBuilder s1 = sb(palabra);
            
            char s = s1.charAt(0);
            
            s1.setCharAt(0, ' ');
            
            String res = charToString(s);
           
            StringBuilder s2 = sb(res);
            
            
           System.out.println(salidaSB(s1,s2));
            
         }
        
    }

     public static StringBuilder sb(String s) {
        StringBuilder s1 = new StringBuilder(s);
        return s1;
    }
     
     public static String charToString(char c) {
        String str = String.valueOf(c);
        return str;
    }
     
      public static String sbToString(StringBuilder s1) {
        String str = s1.toString();
        return str;
    }
     
    public static String entrada() {
        String texto = new Scanner(System.in).nextLine();
        return texto;
    }

    public static String[] split(String texto) {
        String[] token = texto.split(" ");
        return token;
    }
    
    public static void salida(String texto) {
        System.out.println(texto);
    }
    
    public static String salidaSB(StringBuilder s1, StringBuilder s2) {
       
       s1.append(s2).append("ay");
 
       String res = sbToString(s1);
       
       res = res.trim();
        
       return res;
    }
    
    
    
}