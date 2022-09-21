package lista4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista6 {

    // TODO Auto-generated method stub
    static Scanner input = new Scanner(System.in);
    static double saldo;

    public static void main(String[] args) {

        String nome, telefone, email, tipo;
        int rg;
        boolean status;

        System.out.println("Bienvenidos a IFBANK, igrese sus datos:");
        System.out.println("Nombre: ");
        nome = input.nextLine();
        System.out.println("Telefono: ");
        telefone = input.nextLine();
        System.out.println("Email");
        email = input.nextLine();
        System.out.println("Tipo de cuenta: ");
        tipo = input.nextLine();

        while (true) {
            System.out.println("RG:");

            try {
                input = new Scanner(System.in);
                rg = input.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Informe solamente números.");
            }

        }

        while (true) {
            System.out.println("Deposito inicial:");
            try {
                input = new Scanner(System.in);
                saldo = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Informe deposito solamente con números");

            }
        }

        while (true) {
            System.out.println("Status:");
            try {
                input = new Scanner(System.in);
                status = input.nextBoolean();
                break;

            } catch (Exception e) {
                System.out.println("Informe true o false");
            }
        }

        int cuenta = (int) (100 + Math.random() * 900);
        System.out.println("Numero de cuenta generada:" + cuenta);

        int varmenu = 0;
        while (varmenu != 6) {
            varmenu = menu();
            switch (varmenu) {
                case 1 ->
                    sacar();
                case 2 ->
                    depositar();
                case 3 ->
                    imprimir();
                case 4 ->
                    transferir();
                case 5 ->
                    pagar();
            }
        }

    }

    public static int menu() {
        int opcion = 0;

        System.out.println("Informe un valor de 1 a 5, o 6 para salir");
        System.out.println("1-Sacar");
        System.out.println("2-Depositar");
        System.out.println("3-Saldo");
        System.out.println("4-Transferir");
        System.out.println("5-Pagamentos");
        System.out.println("6-Salir");

        while (true) {
            try {
                input = new Scanner(System.in);
                opcion = input.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Valor informado en formato erroneo");
                System.out.println("Informe un valor de 1 a 5, o 6 para salir");
                System.out.println("1-Sacar");
                System.out.println("2-Depositar");
                System.out.println("3-Saldo");
                System.out.println("4-Transferir");
                System.out.println("5-Pagar");
                System.out.println("6-Salir");
            }
        }

        return opcion;
    }

    public static void sacar() {
        double valor = 0;

        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Informe el valor");
                valor = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor informado en formato erroneo");
            }
        }
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Retiro con exito!");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void depositar() {
        double valor = 0;
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Informe o valor");
                valor = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor informado en formato erroneo");
            }
        }

        saldo += valor;
        System.out.println("Deposito realizado con exito!");
        System.out.println("Novo saldo: " + saldo);
    }

    public static void imprimir() {
        System.out.println("Saldo:" + saldo);
    }

    public static void transferir() {
        double valor = 0;
        int conta;
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Numero de cuenta:");
                conta = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Informe solamente números");
            }
        }
        

        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Informe o valor");
                valor = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Valor informado en formato erroneo");
            }
        }
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Transferencia realizada con exito!");
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void pagar() {

        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Numero de boleta:");
                int boleto = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Informe solo números");
            }
        }

        double valor = 0;
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Informe el valor: ");
                valor = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Valor informado em formato errado");
            }
        }
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Pago realizado con exito!");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
