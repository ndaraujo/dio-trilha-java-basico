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

        // negando valores booleanos, false or true

        boolean variavel = true;

        variavel = !variavel; //coloque ! na frente para negar a variavel, a variavel passa a ser false e vise versa

        System.out.println(variavel);

        // operador ternário, condição ternária

        // usando exemplo para saber se os números são iguais

        //exemplo normal com if
        int a = 5;
        int b = 6;

        if (a == b) {
            System.out.println("Verdadeiro");
        }

        else {
            System.out.println("Falso");
        }

        //exemplo usando uma condição ternária

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

    }
}
