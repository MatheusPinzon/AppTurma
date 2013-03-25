import br.com.matheus.utilitarios.io.Console;
import br.com.matheus.utilitarios.validadores.StringUtils;

public class App22 {
    public static void main(String args[])
    {
        float resultado1, resultado2, resultado3, resultadoFinal, x1Float = 0, x2Float = 0, y1Float = 0, y2Float = 0;
        double resultado4;
        
        Console.escrever("Digite o valor para x2: ");
        String x2 = Console.ler();
        
        if (StringUtils.ehInteiro(x2)){
        x2Float = Float.parseFloat(x2);
        }else{
            Console.escrever("O X2 indicado nao é numero: ");
        }
        
        Console.escrever("Digite o valor para x1: ");
        String x1 = Console.ler();
        
        while (StringUtils.ehInteiro(x1) == false){
            x1Float = Float.parseFloat(x1);
            
        }
//        if (StringUtils.ehInteiro(x1)){
//        x1Float = Float.parseFloat(x1);
//        }else{
//            Console.escrever("O X1 indicado nao é numero, insira um numero: ");
//            x1 = Console.ler();
//            
//        }
       
        Console.escrever("Digite o valor para y2: ");
        String y2 = Console.ler();
        
        if (StringUtils.ehInteiro(y2)){
        y2Float = Float.parseFloat(y2);
        }else{
            Console.escrever("O y2 indicado nao é numero: ");
        }
        
        Console.escrever("Digite o valor para y1: ");
        String y1 = Console.ler();
        
        if (StringUtils.ehInteiro(y1)){
        y1Float = Float.parseFloat(y1);
        }else{
            Console.escrever("O Y1 indicado nao é numero: ");
        }
        
               
        resultado1 = x2Float-x1Float;
        resultado2 = y2Float-y1Float;
        resultado3 = resultado1*resultado1 + resultado2*resultado2;
        resultado4 = Math.sqrt(resultado3);
        
        System.out.println("O resultado é: " + resultado4);
    }
}
