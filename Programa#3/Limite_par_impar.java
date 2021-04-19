

import java.util.Scanner;

public class Limite_par_impar {

  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

    int inf, sup;    
    inf = entrada.nextInt();
    sup = entrada.nextInt();

    for (int i=inf; i<=sup; i++){
      if (i%2 == 0){
        System.out.println(i);
      }
    }
    int i=inf;
    while (inf<=sup){
      if (i%2 == 1){
        System.out.println(i);
      }
    i++;  
    }
  }
} 













