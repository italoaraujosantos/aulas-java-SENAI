

// Nome da classe esta em minusculo, o que não é uma boa prática em Java. O nome da classe deve começar com letra maiúscula.
public class SistemaBugado {
    public static void main(String[] args) {
        // Variavel '1valor' não pode começar com número, isso vai gerar um erro de compilação. Variáveis devem começar com letra ou underscore.
        int valor = 10;
        int contador = 5;
        // faltou passar o numero de repetições para o método exibirMensagem, isso vai gerar um erro de compilação.
        exibirMensagem("Bem-vindo ao Sistema!", 3);

        while (contador > 0) {
            // A variável 'valor' está sendo usada corretamente, mas o loop while não tem uma condição de parada clara. Isso pode levar a um loop infinito.
            System.out.println("Valor atual: " + valor);
            valor += 2;
            contador--;
        }
    }

    public static void exibirMensagem(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}
