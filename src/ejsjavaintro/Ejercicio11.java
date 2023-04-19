
/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú. */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, por favor ingrese 2 numeros enteros, para realizar las operaciones que desee: ");
        
        System.out.println("Numero 1: ");
        int num1 = leer.nextInt(); 
        
        while (num1 < 1) {
            System.out.println("Numero invalido, solo numeros POSITIVOS. Intente de nuevo: ");
            num1 = leer.nextInt();
        }
        
        System.out.println("Numero 2: ");
        int num2 = leer.nextInt();
        
        while (num2 < 1) {
            System.out.println("Numero invalido, solo numeros POSITIVOS. Intente de nuevo: ");
            num2 = leer.nextInt();
        }
        
        System.out.println("Los numeros ingresados son : " + num1 + " y " + num2);
        System.out.println("");
       
        int opcion, suma, resta, mult, div;
        String respuesta = "No";
        
        while (respuesta.equalsIgnoreCase("No")) {
          
        System.out.println("MENU");
        System.out.println("1. Sumar"); 
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Elija una opción: ");
        opcion = leer.nextInt();
        System.out.println("");
        
          switch (opcion) {
              case 1:
                  System.out.println("Ud. eligió SUMAR los numeros " + num1 + " y " + num2);
                  suma = num1 + num2;
                  System.out.println("El resultado sería el siguiente: " + num1 + " + " + num2 + " = " + suma);
                  System.out.println("");
                  break;
                  
              case 2:
                  System.out.println("Ud. eligió RESTAR los numeros " + num1 + " y " + num2);
                  resta = num1 - num2;
                  System.out.println("El resultado sería el siguiente: " + num1 + " - " + num2 + " = " + resta);
                  System.out.println("");
                  break;
                  
              case 3:
                  System.out.println("Ud. eligió MULTIPLICAR los numeros " + num1 + " y " + num2);
                  mult = num1 * num2;
                  System.out.println("El resultado sería el siguiente: " + num1 + " x " + num2 + " = " + mult);
                  System.out.println("");
                  break;
                  
              case 4:
                  System.out.println("Ud. eligió DIVIDIR los numeros " + num1 + " y " + num2);
                  div = num1 / num2;
                  System.out.println("El resultado sería el siguiente: " + num1 + " % " + num2 + " = " + div);
                  System.out.println("");
                  break;
                  
              case 5:
                  System.out.println("¿Está seguro que desea salir del programa (Si/No)?");
                  respuesta = leer.next();
                  System.out.println("");
                  if (respuesta.equalsIgnoreCase("Si")) {
                      System.out.println("Fin del menu");
                      System.out.println("Hasta pronto!");
                  break;
                  }
         } 
      } 
   }
}