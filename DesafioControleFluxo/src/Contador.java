// Importando as classes
import java.util.Scanner;

public class Contador {
    private static Scanner terminal;
    public static void main(String[] args) {
        // Criando uma instância do Scanner para ler do teclado
		terminal = new Scanner(System.in);

        //Solicita ao usuário entrar com os valores de parametroUm e parametroDois
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem.
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int indice = 0; indice < contagem; indice++){
            System.out.println("Imprimindo o número " + (indice+1));
        }
	}

    
}
