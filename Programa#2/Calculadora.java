

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        System.out.println("-----Bienvenido a UCal------");
        System.out.println("Ingrese dos numeros enteros para realizar una de las siguientes operaciones");
  
        // Pedir numeros 
        Scanner entrada = new Scanner (System.in);
        float num1,num2;
        char operacion;
        System.out.print("Digite el primer numero: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite el segundo numero: ");
        num2 = entrada.nextFloat();
        System.out.print("Ahora escoja alguna de las siguentes operaciones a realizar entre los dos numeros: ");
        System.out.println("Las opciones son: ");
        System.out.println("escriba + para sumar.");
        System.out.println("escriba - para restar.");
        System.out.println("escriba * para multiplicar.");
        System.out.println("escriba / para dividir.");
        System.out.print("ingrese la opcion a escoger: ");
        operacion = entrada.next().charAt(0);
        System.out.println("La operacion es: "+operacion);
        operardor(num1,num2,operacion);
    }

    public static void operardor(float num1, float num2, char operacion){

      switch (operacion) {
        case '+':
          num1 += num2;
          System.out.println("La suma de los dos numeros es:" + num1);
          break;
        case '-':
        num1 -= num2;
        System.out.println("La resta de los dos numeros es:" + num1);
        break;
        case '*':
          num1 *= num2;
          System.out.println("La multiplicacion de los dos numeros es:" + num1);
          break;
        case '/':
          num1 /= num2;
          System.out.println("La division de los dos numeros es:" + num1);
          break;
      }
    }
}
