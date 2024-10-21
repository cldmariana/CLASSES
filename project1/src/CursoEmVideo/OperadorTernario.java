package CursoEmVideo;

public class OperadorTernario {

    public static void main(String[] args) {

        int n1, n2, r;
        n1 = 5;
        n2 = 4;

        /*
        ponto de interrogação pra verificar a expressão entre parênteses;
        se a expressão é verdadeira, acontece o lado esquerdo dos dois pontos,
        se falsa, acontece o lado direito
         */

        r = (n1 > n2) ? 0 : 1;

        /*
        se n1 é maior que n2, r recebe 0
        senao, r recebe 1
         */

        System.out.println(r);

    }
}
