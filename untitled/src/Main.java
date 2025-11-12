import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char continuar;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1) Calculadora");
            System.out.println("2) Calculador de edad");
            System.out.println("3) Conversor de temperatura");
            System.out.println("4) Contador de Palabras y Caracteres");
            System.out.println("5) Generador de saludos");
            System.out.println("0) Salir");
            System.out.print("Introduce una opción del 0 al 5: ");

            opcion = sc.nextInt();
            sc.nextLine(); // 

            System.out.println("\nHas escogido la opción " + opcion + ".");

            switch (opcion) {
                case 1:

                    double resultado = 0;

                    System.out.print("Ingresa el primer número: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Ingresa el operador (+, -, *, /): ");
                    char operador = sc.next().charAt(0);

                    System.out.print("Ingresa el segundo número: ");
                    double num2 = sc.nextDouble();

                    if (operador == '+') resultado = num1 + num2;
                    else if (operador == '-') resultado = num1 - num2;
                    else if (operador == '*') resultado = num1 * num2;
                    else if (operador == '/') {
                        if (num2 != 0) resultado = num1 / num2;
                        else {
                            System.out.println("Error: no se puede dividir entre cero.");
                            break;
                        }
                    } else {
                        System.out.println("Operador no válido.");
                        break;
                    }

                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    
                    System.out.print("Introduce tu año de nacimiento: ");
                    int anoNacimiento = sc.nextInt();
                    int edad = 2025 - anoNacimiento;
                    System.out.println("Tu edad es: " + edad + " años.");
                    break;

                case 3:
                    
                    System.out.print("Introduce la temperatura en Celsius: ");
                    float celsius = sc.nextFloat();
                    float kelvin = celsius + 273.15f;
                    float fahrenheit = celsius * 1.8f + 32;
                    System.out.println("Fahrenheit: " + fahrenheit);
                    System.out.println("Kelvin: " + kelvin);
                    break;

                case 4:
                    
                    System.out.println("Introduce una cadena de texto:");
                    String texto = sc.nextLine();
                    int numCaracteres = texto.length();
                    String[] palabras = texto.trim().split("\\s+");
                    int numPalabras = texto.trim().isEmpty() ? 0 : palabras.length;
                    System.out.println("Número de caracteres: " + numCaracteres);
                    System.out.println("Número de palabras: " + numPalabras);
                    break;

                case 5:
                    
                    System.out.print("Introduce tu nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("¡Hola, " + nombre + "! Espero que tengas un excelente día 😊");
                    break;

                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    sc.close();
                    return;

                default:
                    System.out.println("Has escogido una opción incorrecta. Intenta nuevamente.");
            }

            
            System.out.print("\n¿Deseas volver al menú? (S/N): ");
            continuar = sc.next().charAt(0);
            sc.nextLine(); 

        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nPrograma finalizado. ¡Gracias por usarlo!");
        sc.close();
    }
}
