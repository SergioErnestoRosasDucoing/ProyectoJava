package calculadora;

import java.util.Scanner;

/**
 *
 * @author SERGIO ERNESTO
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú calculadora"
                + "\n 1. Calcular el Máximo Común Divisor (MCD)"
                + "\n 2. Calcular el mínimo común multiplo (mcm)"
                + "\n 3. Calcular la solución de una equación de segundo grado"
                + "\n 4. Salir del programa");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Menú MCD"
                        + "\n 1. Calcular el MCD de 2 números"
                        + "\n 2. Calcular el MCD de 3 números");
                int opMCM = sc.nextInt();

                int MCDnumero1,
                        MCDnumero2,
                        MCDnumero3,
                        maximo,
                        MCD;

                switch (opMCM) {

                    case 1:
                        System.out.println("Ingresa el primer número");
                        MCDnumero1 = sc.nextInt();

                        System.out.println("Ingresa el segundo número");
                        MCDnumero2 = sc.nextInt();

                        maximo = Math.max(MCDnumero1, MCDnumero2);

                        MCD = 0;
                        for (int i = 1; i < maximo; i++) {
                            int varTemp1 = MCDnumero1 % i;
                            int varTemp2 = MCDnumero2 % i;

                            if (varTemp1 == 0 && varTemp2 == 0) {
                                MCD = i;
                            }
                        }

                        System.out.println(
                                "El máximo común divisor de " + MCDnumero1 + " y " + MCDnumero2 + " es:" + MCD);

                        break;
                    case 2:
                        System.out.println("Ingresa el primer número");
                        MCDnumero1 = sc.nextInt();

                        System.out.println("Ingresa el segundo número");
                        MCDnumero2 = sc.nextInt();

                        System.out.println("Ingresa el tercer número");
                        MCDnumero3 = sc.nextInt();

                        maximo = Math.max(Math.max(MCDnumero1, MCDnumero2), MCDnumero3);

                        MCD = 0;
                        for (int i = 1; i < maximo; i++) {
                            int varTemp1 = MCDnumero1 % i;
                            int varTemp2 = MCDnumero2 % i;
                            int varTemp3 = MCDnumero2 % i;

                            if (varTemp1 == 0 && varTemp2 == 0 && varTemp3 == 0) {
                                MCD = i;
                            }
                        }

                        System.out.println("El máximo común divisor de " + MCDnumero1 + ", " + MCDnumero2 + " y "
                                + MCDnumero3 + " es:" + MCD);
                        break;
                    default:
                        System.out.println(
                                "El número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú");
                        opMCM = sc.nextInt();
                }
                break;
            case 2:
                System.out.println("Menú MCD"
                        + "\n 1. Calcular el MCD de 2 números"
                        + "\n 2. Calcular el MCD de 3 números");
                int opmcm= sc.nextInt();

                int mcmnumero1, mcmnumero2, mcmnumero3, minimo, mcm;

                switch (opMCM) {

                    case 1:
                        System.out.println("Ingresa el primer número");
                        MCDnumero1 = sc.nextInt();

                        System.out.println("Ingresa el segundo número");
                        MCDnumero2 = sc.nextInt();

                        maximo = Math.max(MCDnumero1, MCDnumero2);

                        MCD = 0;
                        for (int i = 1; i < maximo; i++) {
                            int varTemp1 = MCDnumero1 % i;
                            int varTemp2 = MCDnumero2 % i;

                            if (varTemp1 == 0 && varTemp2 == 0) {
                                MCD = i;
                            }
                        }

                        System.out.println(
                                "El máximo común divisor de " + MCDnumero1 + " y " + MCDnumero2 + " es:" + MCD);

                        break;
                    case 3:
                        System.out.println("Ingresa el primer número");
                        MCDnumero1 = sc.nextInt();

                        System.out.println("Ingresa el segundo número");
                        MCDnumero2 = sc.nextInt();

                        System.out.println("Ingresa el tercer número");
                        MCDnumero3 = sc.nextInt();

                        maximo = Math.max(Math.max(MCDnumero1, MCDnumero2), MCDnumero3);

                        MCD = 0;
                        for (int i = 1; i < maximo; i++) {
                            int varTemp1 = MCDnumero1 % i;
                            int varTemp2 = MCDnumero2 % i;
                            int varTemp3 = MCDnumero2 % i;

                            if (varTemp1 == 0 && varTemp2 == 0 && varTemp3 == 0) {
                                MCD = i;
                            }
                        }

                        System.out.println("El máximo común divisor de " + MCDnumero1 + ", " + MCDnumero2 + " y "
                                + MCDnumero3 + " es:" + MCD);
                        break;
                    default:
                        System.out.println(
                                "El número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú");
                        opMCM = sc.nextInt();
                        case 4:
                        break;
                }

                break;
            default:
                System.out.println(
                        "El número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú");
                opcion = sc.nextInt();
        }
    }

}
