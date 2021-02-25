import java.util.Scanner;
public class recebendodados {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		// A linha abaixo cria uma variável ( espaço na memória ) para guardamos um dado . Nesse caso
		
		String nomeUsuario;
		System.out.println("Por favor, escreva seu nome:");
// \ A linha abaixo le o texto que o usuário escreve no seu teclado
	nomeUsuario =leitor.next();
// A linha abaixo exibe o conteúdo da variável . Ela faz isso ao exibir um texto e junt-ló a váriavel
System.out.println("Obrigado por utilizar o programa,"+ nomeUsuario ) ;

leitor.close ();

}
}