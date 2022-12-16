//b)   Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de 
//um número qualquer. 
package Exercicios;

import java.util.Scanner;

public class ExercicioB {

public static void main (String[]args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("informe um número para ver sua tabuada");

int numero = sc.nextInt();

for (var contadora = 1; contadora <= 10; contadora++) {
	
System.out.println  (numero + " X " + contadora + " = " + contadora * numero );

}	
}
}