public class Operadores {
    public static void main(String[] args) throws Exception {
        //exemplo de concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        //exemplo para tornar um valor negativo
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        //exemplo para tornar um número positivo, é só multiplicar por -1
        numero = numero * -1;

        System.out.println(numero);

        //exemplo de soma e concatenação, toda vez que tiver uma string, os número sequenciais serão concatenados
        String concatenacao = "?";
        
        concatenacao = 1 + 1 + "1" + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        //exemplo de incremento com operador ++ e decremento com operador --

        int numero1 = 10;
        
        numero1++; //mesma coisa que numero1 = numero1 + 1;

        System.out.println(numero1);

        numero1--; //mesma coisa que numero = numero1 - 1;

        System.out.println(numero1);
    }
}
