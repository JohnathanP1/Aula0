import java.util.Scanner;
public class recebendodados {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		// A linha abaixo cria uma vari�vel ( espa�o na mem�ria ) para guardamos um dado . Nesse caso
		
		String nomeUsuario;
		System.out.println("Por favor, escreva seu nome:");
// \ A linha abaixo le o texto que o usu�rio escreve no seu teclado
	nomeUsuario =leitor.next();
// A linha abaixo exibe o conte�do da vari�vel . Ela faz isso ao exibir um texto e junt-l� a v�riavel
System.out.println("Obrigado por utilizar o programa,"+ nomeUsuario ) ;

leitor.close ();

}
}