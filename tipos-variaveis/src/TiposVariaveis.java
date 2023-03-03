public class TiposVariaveis {
    public static void main(String[] args)  {

        System.out.println("Hello, World!");

        // Estudar classe String que representa texto na aplicaçãp
       // double salarioMinimo = 2500;

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 2;
        System.out.println(numero);
        numero = 1;
        System.out.println(numero);

        final double VALOR_PI = 3.14; // Por convençao as variaveis constante devera ser escrita toda em caixa alta.
        System.out.println(VALOR_PI);
        
        // valorPi = 10.75; Para declarar uma variavel constante (que não mudo o valor) usamos o final, assim não será permitido atribuir valor a variavel
    }
}
