package lista4;


import java.util.Scanner;



public class ejercicio3 {

    public static void main(String[] args) {

        
         while(true)
        {
        salida("Ingrese una fecha con formato 1/1/2022 o 1 de enero del 2022, o digite 0 (cero) para salir \n");

        String fecha = entrada();
   
        if(fecha.equals("0")){
         break; }
        
        if(fecha.contains("/")){
         salida(fechaANum(fecha));
        }
        else{
        
        if (fecha.contains(" ")) {
         salida(fechaTxt(fecha)); }
        
        else{
        salida("Ingrese una fecha con formato valido \n"); }
        
        
        }
        
        }
        

    
    
    }
    public static String entrada() {
        String texto = new Scanner(System.in).nextLine();
        return texto;
    }
 public static StringBuilder fechaANum(String fecha) {
        
        String[] texto = fecha.split("/");
        
        int mesNum = Integer.valueOf(texto[1]); 
      
        StringBuilder s1 = new StringBuilder(texto[0]);
        
        s1.append(" ").append(numeroAMes(mesNum)).append(" del ").append(texto[2]);
        
        
        return s1;
    }
 
 public static StringBuilder fechaTxt(String fecha) {
         
        String[] texto = fecha.split(" ");
        
        StringBuilder s1 = new StringBuilder(texto[0]);
        
        s1.append("/").append(mesANum(texto[1])).append("/").append(texto[3]);
        
        return s1;
    }
 
 
 
    public static String numeroAMes(int num) {
        
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Setiembre", "Octubre", "Noviembre", "Diciembre" };
        
        int cont = 1;
        
        String mestx = "";
        
        for (String mes : meses) {
            
            if(num == cont){ mestx = mes; break; }
            else{ cont++; }
        }
        
        return mestx;
    }
    
     public static int mesANum(String mestxt) {
        
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Setiembre", "Octubre", "Noviembre", "Diciembre" };
        mestxt = mestxt.toLowerCase();
        int cont = 1;
        int n = 0;
        for (String mes : meses) {
            
            mes = mes.toLowerCase();
            
            if(mes == null ? mestxt != null : !mes.equals(mestxt)){ cont++; }
            
            else{ n = cont; break; }
        }
        
        return n;
    }

    public static void salida(String texto) {
        System.out.println(texto);
    }
    public static void salida(StringBuilder texto) {
        System.out.println(texto);
    }

    

    

}
