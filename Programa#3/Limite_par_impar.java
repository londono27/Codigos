import java.util.Scanner;

public class Limite_par_impar{

  public static void main (String[] argv){

  int Inf, Sup;

  Scanner leer=new Scanner (System.in);   
  System.out.println("Ingrese el limite inferior:");
  Inf=leer.nextInt();
  System.out.println("Ingrese el limite superior:");
  Sup=leer.nextInt();

  System.out.println("Pares");
  for (int i=Inf; i<=Sup; i++){
    if (i%2==0){
      System.out.println(i);
    }
  }

  System.out.println("Impares");
  int j;
  j=Inf;
  while (j<=Sup){
    if (j%2!=0){
    System.out.println(j);
    }
  j++;  
  }
  }
}











