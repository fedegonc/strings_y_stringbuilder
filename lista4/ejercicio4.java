package lista4;

public class ejercicio4 {

    public static void main(String[] args) {

        String[] letras = txt();

        String[] morse = mrs();

        String mrs1 = "-... --- .- / -. --- .. - .";
        String mrs2 = " .--. .-. --- --. .-. .- -- .- -.-. .- --- / .----";
        String mrs3 = ".. ..-. ... ..- .-.. / -.-. .- -- .--. ..- ... / ... .- -. - .- -. .- / -.. --- / .-.. .. ...- .-. .- -- . -. - ---";

        String[] s1 = split(mrs1);
        String[] s2 = split(mrs2);
        String[] s3 = split(mrs3);

        salida(sb(s1, morse, letras));
        salida(sb(s2, morse, letras));
        salida(sb(s3, morse, letras));

    }

    public static void salida(String texto) {
        System.out.println(texto);
    }

    public static void salida(StringBuilder texto) {
        System.out.println(texto);
    }

    public static StringBuilder sb(String[] s1, String[] s2, String[] s3) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; s1.length > i; i++) {
            for (int j = 0; s2.length > j; j++) {
                if (s1[i].equals(s2[j])) {
                    sb.append(s3[j]);
                }
            }

        }
        return sb;
    }

    public static String[] split(String s1) {

        String[] spl = s1.split(" ");

        return spl;
    }

    public static String[] txt() {

        String[] letras = {" ", "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        return letras;
    }

    public static String[] mrs() {

        String[] morse = {"/", ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        return morse;
    }

}
