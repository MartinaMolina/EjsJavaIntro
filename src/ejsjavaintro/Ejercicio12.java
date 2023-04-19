
/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. 

Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
Substring(), Length(), equals(). */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  
        System.out.println("BIENVENIDO A 'RS232'");
        System.out.println("");
        System.out.println("ACLARACIONES: ");
        System.out.println("");
        System.out.println("1) ESTE SISTEMA SOLO CUENTA PALABRAS CORRECTAS"
                         + " ,es decir, deben empezar con X y terminar con O, "
                         + "ademas deben ser de 5 caracteres.");
        System.out.println("");
        System.out.println("2) PARA SALIR INGRESE LO SIGUIENTE: '&&&&&'");
        System.out.println("");
        System.out.println("A continuacion, escriba la palabra que desee: ");
        String cadena = leer.nextLine();
       
        int correcta, incorrecta;
        correcta = 0;
        incorrecta = 0;
        
        while (!cadena.equals("&&&&&")) {

            if ((cadena.substring(0,1).equalsIgnoreCase("x")) && ((cadena.endsWith("o")) || (cadena.endsWith("O"))) && (cadena.length() == 5)) {
                correcta++;    
            } else {
                incorrecta++;
            }
            
            System.out.println("Continue ingresando otra palabra: ");
            cadena = leer.nextLine();      
        }
        
        System.out.println("HA SALIDO DEL SISTEMA!");
        System.out.println("Ademas, sus palabras CORRECTAS fueron: " + correcta);
        System.out.println("Y sus palabras INCORRECTAS: " + incorrecta);
        
    }
}
