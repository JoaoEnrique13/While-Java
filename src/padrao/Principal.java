package padrao;

import java.util.Scanner;
/**
 *
 * @author João Enrique
 */
public class Principal 
{//declarando variaveis
    public static Scanner teclado = new Scanner(System.in);//teclado
    public static int numero = 0;//numero que o suario vai digitar
    public static Tabuada tabuada = new Tabuada();//classe que será feito a conta
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Tabuada");
        System.out.print("Por favor informe o número para a tabuada: ");
        numero = teclado.nextInt();
        
        tabuada.CalcularTabuada(numero);//mostrar resultado
    }
    
}
