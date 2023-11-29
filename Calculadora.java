package calculadora;

import java.util.Scanner;

/**
 * @author SERGIO ERNESTO ROSAS DUCOING Y ABRAHAM RODRIGUEZ CONTRERAS
 */
public class Calculadora {

    // Método para validar que el usuario ingresó numeros enteros
    public static boolean validarNumeros(String numero) {
        int num;
        try {
            num = Integer.parseInt(numero);
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    // Método para validar que el usuario ingresó numeros con punto decimal
    public static boolean validarNumerosDouble(String numero) {
        double num;
        try {
            num = Double.parseDouble(numero);
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    // Método para convertir los números negativos a positivos
    public static int convertirAPositivo(int numero) {
        if (numero < 0) {
            numero = -numero;
        }
        return numero;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcionElegida, numeroIngresado;
        int opcion;

        do {
            // Menú principal de la calculadora
            System.out.println("\u001b[32;1mMenú calculadora\u001B[0m"
                    + "\n 1. Calcular el máximo común divisor (MCD)"
                    + "\n 2. Calcular el mínimo común multiplo (mcm)"
                    + "\n 3. Calcular la solución de una ecuación de segundo grado"
                    + "\n 4. Salir del programa");
            opcionElegida = sc.next();

            while (!validarNumeros(opcionElegida)) {
                System.out
                        .println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                opcionElegida = sc.next();
            }
            opcion = Integer.parseInt(opcionElegida);

            while (opcion < 1 || opcion > 4) {
                System.out
                        .println("\u001b[31mEl número ingresado no corresponde a una acción dentro del menú\u001B[0m");
                System.out.println("\u001b[31mPor favor ingresa un número que esté dentro del menú\u001B[0m");
                opcionElegida = sc.next();
                while (!validarNumeros(opcionElegida)) {
                    System.out
                            .println(
                                    "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                    opcionElegida = sc.next();
                }
                opcion = Integer.parseInt(opcionElegida);
            }

            switch (opcion) {
                case 1:
                    // Menú para máximo común divisor
                    System.out.println("\u001b[32;1mMenú MCD\u001B[0m"
                            + "\n 1. Calcular el MCD de 2 números"
                            + "\n 2. Calcular el MCD de 3 números");
                    opcionElegida = sc.next();

                    while (!validarNumeros(opcionElegida)) {
                        System.out.println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                        opcionElegida = sc.next();
                    }
                    int opMCM = Integer.parseInt(opcionElegida);

                    int MCDnumero1,
                            MCDnumero2,
                            MCDnumero3,
                            maximo,
                            MCD;

                    switch (opMCM) {

                        case 1:
                            System.out.println("Ingresa el primer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            MCDnumero1 = Integer.parseInt(numeroIngresado);
                            MCDnumero1 = convertirAPositivo(MCDnumero1);

                            System.out.println("Ingresa el segundo número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            MCDnumero2 = Integer.parseInt(numeroIngresado);
                            MCDnumero2 = convertirAPositivo(MCDnumero2);

                            maximo = Math.max(MCDnumero1, MCDnumero2);

                            if (MCDnumero1 == 0) {
                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + " y " + MCDnumero2
                                                + " es: \u001b[35;1m" + MCDnumero2);
                            } else if (MCDnumero2 == 0) {
                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + " y " + MCDnumero2
                                                + " es: \u001b[35;1m" + MCDnumero1);
                            } else {
                                MCD = 0;
                                for (int i = 1; i < maximo; i++) {
                                    int varTemp1 = MCDnumero1 % i;
                                    int varTemp2 = MCDnumero2 % i;

                                    if (varTemp1 == 0 && varTemp2 == 0) {
                                        MCD = i;
                                    }
                                }

                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + " y " + MCDnumero2
                                                + " es: \u001b[35;1m"
                                                + MCD);

                            }

                            break;
                        case 2:
                            System.out.println("Ingresa el primer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            MCDnumero1 = Integer.parseInt(numeroIngresado);
                            MCDnumero1 = convertirAPositivo(MCDnumero1);

                            System.out.println("Ingresa el segundo número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            MCDnumero2 = Integer.parseInt(numeroIngresado);
                            MCDnumero2 = convertirAPositivo(MCDnumero2);

                            System.out.println("Ingresa el tercer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            MCDnumero3 = Integer.parseInt(numeroIngresado);
                            MCDnumero3 = convertirAPositivo(MCDnumero3);

                            maximo = Math.max(Math.max(MCDnumero1, MCDnumero2), MCDnumero3);

                            if (MCDnumero1 == 0 && MCDnumero2 == 0) {
                                System.out
                                        .println("\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", "
                                                + MCDnumero2 + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCDnumero3);
                                break;
                            } else if (MCDnumero1 == 0 && MCDnumero3 == 0) {
                                System.out
                                        .println("\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", "
                                                + MCDnumero2 + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCDnumero2);
                                break;
                            } else if (MCDnumero2 == 0 && MCDnumero3 == 0) {
                                System.out
                                        .println("\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", "
                                                + MCDnumero2 + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCDnumero1);
                                break;
                            } else if (MCDnumero1 == 0) {
                                MCD = 0;
                                for (int i = 1; i < maximo; i++) {
                                    int varTemp2 = MCDnumero2 % i;
                                    int varTemp3 = MCDnumero3 % i;

                                    if (varTemp2 == 0 && varTemp3 == 0) {
                                        MCD = i;
                                    }
                                }
                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", " + MCDnumero2
                                                + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCD);

                                break;
                            } else if (MCDnumero2 == 0) {
                                MCD = 0;
                                for (int i = 1; i < maximo; i++) {
                                    int varTemp1 = MCDnumero1 % i;
                                    int varTemp3 = MCDnumero3 % i;

                                    if (varTemp1 == 0 && varTemp3 == 0) {
                                        MCD = i;
                                    }
                                }
                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", " + MCDnumero2
                                                + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCD);

                                break;
                            } else if (MCDnumero3 == 0) {
                                MCD = 0;
                                for (int i = 1; i < maximo; i++) {
                                    int varTemp1 = MCDnumero1 % i;
                                    int varTemp2 = MCDnumero2 % i;

                                    if (varTemp1 == 0 && varTemp2 == 0) {
                                        MCD = i;
                                    }
                                }
                                System.out.println(
                                        "\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", " + MCDnumero2
                                                + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCD);

                                break;
                            } else {
                                MCD = 0;
                                for (int i = 1; i < maximo; i++) {
                                    int varTemp1 = MCDnumero1 % i;
                                    int varTemp2 = MCDnumero2 % i;
                                    int varTemp3 = MCDnumero2 % i;

                                    if (varTemp1 == 0 && varTemp2 == 0 && varTemp3 == 0) {
                                        MCD = i;
                                    }
                                }

                                System.out
                                        .println("\u001b[36;1mEl máximo común divisor de " + MCDnumero1 + ", "
                                                + MCDnumero2 + " y "
                                                + MCDnumero3 + " es: \u001b[35;1m" + MCD);

                            }

                            break;
                        default:
                            System.out.println(
                                    "\u001b[31mEl número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú");

                    }
                    break;
                case 2:
                    System.out.println("\u001b[32;1mMenú mcm\u001B[0m"
                            + "\n 1. Calcular el mcm de 2 números"
                            + "\n 2. Calcular el mcm de 3 números");
                    opcionElegida = sc.next();

                    while (!validarNumeros(opcionElegida)) {
                        System.out.println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                        opcionElegida = sc.next();
                    }
                    int opmcm = Integer.parseInt(opcionElegida);

                    int mcmnumero1,
                            mcmnumero2,
                            mcmnumero3,
                            mcm;

                    switch (opmcm) {

                        case 1:
                            System.out.println("Ingresa el primer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            mcmnumero1 = Integer.parseInt(numeroIngresado);

                            System.out.println("Ingresa el segundo número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            mcmnumero2 = Integer.parseInt(numeroIngresado);

                            maximo = Math.max(mcmnumero1, mcmnumero2);

                            MCD = 0;
                            for (int i = 1; i < maximo; i++) {
                                int varTemp1 = mcmnumero1 % i;
                                int varTemp2 = mcmnumero2 % i;

                                if (varTemp1 == 0 && varTemp2 == 0) {
                                    MCD = i;
                                }
                            }
                            mcm = (mcmnumero1 * mcmnumero2) / MCD;

                            System.out.println(
                                    "\u001b[36;1mEl mínimo común multiplo de " + mcmnumero1 + " y " + mcmnumero2
                                            + " es: \u001b[35;1m" + mcm);

                            break;
                        case 2:
                            System.out.println("Ingresa el primer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            mcmnumero1 = Integer.parseInt(numeroIngresado);

                            System.out.println("Ingresa el segundo número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            mcmnumero2 = Integer.parseInt(numeroIngresado);

                            System.out.println("Ingresa el tercer número");
                            numeroIngresado = sc.next();
                            while (!validarNumeros(numeroIngresado)) {
                                System.out.println(
                                        "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                                numeroIngresado = sc.next();
                            }
                            mcmnumero3 = Integer.parseInt(numeroIngresado);

                            maximo = Math.max(Math.max(mcmnumero1, mcmnumero2), mcmnumero3);

                            MCD = 0;
                            for (int i = 1; i < maximo; i++) {
                                int varTemp1 = mcmnumero1 % i;
                                int varTemp2 = mcmnumero2 % i;
                                int varTemp3 = mcmnumero2 % i;

                                if (varTemp1 == 0 && varTemp2 == 0 && varTemp3 == 0) {
                                    MCD = i;
                                }
                            }
                            mcm = (mcmnumero1 * mcmnumero2 * mcmnumero3) / MCD;

                            System.out.println(
                                    "\u001b[36;1mEl mínimo común multiplo de " + mcmnumero1 + ", " + mcmnumero2 + " y "
                                            + mcmnumero3 + " es: \u001b[35;1m" + mcm);
                            break;
                        default:
                            System.out.println(
                                    "\u001b[31mEl número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú\u001B[0m");
                    }

                    break;
                case 3:
                    System.out.println(
                            "\u001b[32;1mIngresa los números de la ecuación cuadrática a resolver de la siguiente manera: ax^2 + bx + c = 0, NOTA: no es necesario poner el 0\u001B[0m");
                    System.out.println("Ingresa el valor de a (el valor debe ser entero):");
                    numeroIngresado = sc.next();
                    while (!validarNumerosDouble(numeroIngresado)) {
                        System.out.println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                        numeroIngresado = sc.next();
                    }
                    double a = Double.parseDouble(numeroIngresado);

                    System.out.println("Ingresa el valor de b (el valor debe ser entero):");
                    numeroIngresado = sc.next();
                    while (!validarNumerosDouble(numeroIngresado)) {
                        System.out.println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                        numeroIngresado = sc.next();
                    }
                    double b = Double.parseDouble(numeroIngresado);

                    System.out.println("Ingresa el valor de c (el valor debe ser entero):");
                    numeroIngresado = sc.next();
                    while (!validarNumerosDouble(numeroIngresado)) {
                        System.out.println(
                                "\u001b[31mLa entrada no es válida, por favor elige una de las opciones existentes dentro del menú\u001B[0m");
                        numeroIngresado = sc.next();
                    }
                    double c = Double.parseDouble(numeroIngresado);

                    double raiz = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

                    double resultadoPositivo = ((-b) + raiz) / (2 * a);
                    System.out.println(
                            "\u001b[36;1mEl resultado positivo de la ecuación es :\u001b[35;1m" + resultadoPositivo);
                    double resultadoNegativo = ((-b) - raiz) / (2 * a);
                    System.out.println(
                            "\u001b[36;1mEl resultado positivo de la ecuación es :\u001b[35;1m" + resultadoNegativo);

                    break;
                case 4:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
                default:
                    System.out.println(
                            "\u001b[31mEl número ingresado, no esta dentro de la lista de opciones, por favor ingresa un número que este dentro del menú\u001B[0m]");
                    opcion = sc.nextInt();
            }

        } while (opcion != 4);
        sc.close();
    }

}
// commit