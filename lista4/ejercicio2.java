package lista4;



public class ejercicio2 {

    public static void main(String[] args) {

        String[] sustantivo = {"perro", "gato", "canguro", "tiburon", "jabali", "caballo" };
        String[] adjetivo = {"verde", "grande", "chico", "dormilon", "gordo", "flaco"};
        String[] verbo = {"mordio", "salto", "corrio", "ladro", "grito", "hablo"};
        String[] local = {"Rivera", "Livramento", "Pelotas", "Australia", "Bage", "Goias"};

        for (int i = 0; 23 > i; i++) {

            int indice = rand();
            int indice1 = rand();
            int indice2 = rand();
            int indice3 = rand();

            var sf = sb(sustantivo[indice], adjetivo[indice1], verbo[indice2], local[indice3]);

            salida(sf);

        }

    }

    public static void salida(String texto) {
        System.out.println(texto);
    }

    public static void salida(StringBuilder texto) {
        System.out.println(texto);
    }

    public static int rand() {

        int rand;
        rand = (int) (Math.random() * 6);
        return rand;
    }

    public static StringBuilder sb(String s1, String s2, String s3, String s4) {

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        StringBuilder sb3 = new StringBuilder(s3);
        StringBuilder sb4 = new StringBuilder(s4);

        char c = sb1.charAt(0);
        String k = String.valueOf(c);
        k = k.toUpperCase();
        String r = k;
        c = r.charAt(0);
        sb1.setCharAt(0, c);

        sb1.append(" ").append(sb2).append(" ").append(sb3).append(" en ").append(sb4).append('.');

        return sb1;
    }

}
