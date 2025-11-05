import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Menu programa
        System.out.println("Bienvenido al menu, a continuacion verás 5 opciones de programa.");
        System.out.println("1) Calculadora.");
        System.out.println("2) Calculador de edad.");
        System.out.println("3) Conversor de temperatura.");
        System.out.println("4) Contador de Palabras i Caracteres.");
        System.out.println("5) Generador de saludos.");
        System.out.println("Introduce una opción del 1 al 5.");

        int opcion = sc.nextInt();

        System.out.println("Has escogido la opción " + opcion+".");

        // Calculadora

        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a la calculadora.");

                double resultado = 0;

                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingresa el operador (+, -, *, /): ");
                char operador = sc.next().charAt(0);

                System.out.print("Ingresa el segundo número a operar: ");
                double num2 = sc.nextDouble();

                if (operador == '+') {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '-') {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '*') {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '/') {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                } else {
                    System.out.println("Operador no válido.");
                }
            // Calculador de edad
            case 2:

                System.out.println("Bienvenido al calculador de edad, a continuación introduzca su año de nacimiento:");

                int anoNacimiento = sc.nextInt();
                int operacionEdad = 2025 - anoNacimiento;

                System.out.println("Su año de nacimiento es " + anoNacimiento + " y su edad es " + operacionEdad + ".");


            // Conversor de temperatura
            case 3:

               System.out.println("elije estas alguna de estas dos opciones");
        System.out.println("1. pasar de farenheit a celcius");
        System.out.println("2. pasar de celcius a farenheit");

        int opcion = sc.nextInt();

        float  celcius, farenheint, resultado1, resultado2 ;

        System.out.println("introduszca temperatua ha calcula ");

        if (opcion == 1){
            farenheint = sc.nextInt();
            resultado1 = (farenheint -32) * 0.56f ;
            System.out.println(farenheint+" farenhint es igual a "+ resultado1+ " celcius");
        }
        else if (opcion == 2) {
            celcius = sc.nextInt();
            resultado2 = (celcius*9/5) + 32 ;
            System.out.println(celcius+" celcius es igaul a "+ resultado2 +" farenheint");
        }
        else {
            System.out.println("Opcion invalida");
        }



            // Contador de palabras
            case 4:

                System.out.println("Bienvenido al contador de palabras i caracteres, a continuación introduzca una cadena de texto:");

                String cadenaTexto = sc.nextLine();



            // Generador de saludos
            case 5:

                System.out.println("Bienvenido al generador de saludos.");

                System.out.println("1) ¡Hola, [Nombre]! Bienvenido/a");
                System.out.println("2) ¡Buenas, [Nombre]! ¿Cómo andas?");
                System.out.println("3) Estimado/a [Nombre], espero que se encuentre muy bien.");

                System.out.println("A continuación introduzca su nombre y escoja entre uno de estos tres saludos. (Marque un número del 1 al 3)");

                String nombre = sc.next();
                int respuesta = sc.nextInt();


                if (respuesta == 1) {
                    System.out.println("¡Hola, " + nombre + "! Bienvenido/a.");
                }
                else if (respuesta == 2) {
                    System.out.println("¡Buenas, " + nombre + "! ¿Cómo andas?");
                }
                else if (respuesta == 3) {
                    System.out.println("Estimado/a " + nombre + ", espero que se encuentre muy bien.");
                }
                else {
                    System.out.println("Error");
                }



        }



    }
}

