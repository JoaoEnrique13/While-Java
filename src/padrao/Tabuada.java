package padrao;

/**
 *
 * @author João Enrique
 */
public class Tabuada 
{
    private int contador;//declarando contador
    
    public Tabuada()//metodo construtor
    {
    
    }
    
    public int getContador()//metodo get construtor
    {
        return contador;
    }
    
    public void setContador(int contador)//metodo set construtor
    {
        this.contador = contador;
    }
    
    void CalcularTabuada(int numero)//Classe que faz a conta
    {
        this.setContador(1);//iniciando contador com 1
        
        int result = 1;//iniciando result com 1
        
        while (this.getContador() <= 10)//contador vai até 10
        {
            result = this.getContador() * numero;//calcluar resultado
            
            System.out.println(this.getContador() + " X " + numero + " = " + result);//mostrar resultado
            
            this.setContador(this.getContador()+ 1);//adiciona mais 1 para o contador
        }
    }
}
