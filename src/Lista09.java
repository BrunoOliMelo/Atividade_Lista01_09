
import java.util.Scanner;

public class Lista09 {
 public static void main(String[] args) throws Exception{
   //Declaração de Variaveis
    double fahrenheit;
    double celsius;

   //Passo 1: Entrada de Dados  
    Scanner teclado = new Scanner(System.in);
    System.out.print("Fahrenheit:");
    fahrenheit = teclado.nextDouble();
   

   //Passo 2: Converter fahrenheit para celcius 

   celsius =   5 * ((fahrenheit - 32) / 9);

   //Passo 3: Saida de dados
    System.out.printf("Celcius: %.2f", celsius);
    teclado.close();

    }
}
