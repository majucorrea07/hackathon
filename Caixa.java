package hackathon;
import java.util.Scanner;
import java.util.ArrayList;

public class Caixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao, i = 1, soma = 0;
		String resposta;
		ArrayList<String> carrinho = new ArrayList<String>();
		
		System.out.println("Deseja adicionar algum produto?");
		System.out.println("[1]Adicionar Produtos");
		opcao = ler.nextInt();
		
		if (opcao == 1) {
			
				System.out.println("Qual produto deseja adicionar ao carrinho?");
				resposta = ler.next();
				carrinho.add(resposta);
				System.out.println(carrinho); 
			    
			}
			ler.close();
		}
	}
	
	   
	

	