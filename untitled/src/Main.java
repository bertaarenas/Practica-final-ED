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

                System.out.println("Bienvenido al conversor de temperatura, a continuacion introduzca la temperatura deseada en celsius: ");

                float celsius = sc.nextFloat();

                float kelvins = celsius + 273.15f;
                float fahrenheit = celsius * 1.8f + 32;

                System.out.println("Fahrenheit: " + fahrenheit);
                System.out.println("Kelvin: " + kelvins);



            // Contador de palabras
            case 4:

                System.out.println("Bienvenido al contador de palabras i caracteres, a continuación introduzca una cadena de texto:");

                String cadenaTexto = sc.nextLine();



            // Generador de saludos
            case 5:



        }



    }
}

