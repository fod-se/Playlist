import java.util.Locale;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args){
		
		Scanner input =  new Scanner(System.in);
			input.useLocale(Locale.US); //aceita input double
	 Player meuPlayer = new Player(20);
		int numeroMenu;
		 
		 do {
			 printMenu();
			 numeroMenu = input.nextInt();
			 input.nextLine();
			 switch (numeroMenu){
			 case 1:
				 criarPlaylist(input , meuPlayer);
				 break;
			 case 2:
				 adicionarMusica(input,meuPlayer);
				 break;
			 case 3:	
				 removerMusica(input, meuPlayer);
				 break;
			 case 4:
				 listarMusicas(input, meuPlayer);
				 break;
			 case 5:
				 	playMusica(input, meuPlayer);
			 case 0:
				 System.out.println("Ate a proxima");
				 break;
				 default: 
				 	System.out.println("Opção inexistente");
				 break; 
			 }
		 }
			 while (numeroMenu != 0);
		 
	}
		 
	private static void criarPlaylist(Scanner input,Player player){
		String nome;
		System.out.println("Qual o nome da playlist");
		nome=input.nextLine();
		player.criaPlaylist(nome,20);
	}
	public static void adicionarMusica(Scanner input, Player player){
		System.out.println("Qual o numero da playlist?(Nota: Primeira playlist tem o numero = 0)");
		int playlist= input.nextInt();
		input.nextLine();
		System.out.println("Qual o titulo?");	
		String titulo = input.nextLine();
		System.out.println("Quem e o autor?");	
		String autor = input.nextLine();
		System.out.println("Qual o genero?");	
		String estilo = input.nextLine();
		System.out.println("Quando tempo?");	
		double duracao = input.nextDouble();
		System.out.println("Qual a localizacao?");
		String localizacao=input.nextLine();
		input.nextLine();
		player.adicionaMusica(playlist  , new Musica(titulo, autor, estilo, duracao,localizacao));
	}
	
		private static void playMusica(Scanner input, Player player){
			System.out.println("Qual a playlist?");
			int nrPlaylist=input.nextInt();
			input.nextLine();
			System.out.println("Qual a musica?");
			int nrMusica=input.nextInt();
			input.nextLine();
			try{ 
				player.playMusica(nrPlaylist, nrMusica);
			
			} catch(Exception a){
					System.out.println(a.getMessage());
			}
	
			
		}
	
		 private static void removerMusica(Scanner input, Player player) {
		System.out.println("Qual o numero da playlist?");
		int playlist=input.nextInt();
		 System.out.println("Introduz o numero da musica a ser removida");
		 int numMusica = input.nextInt();
		 input.nextLine();
		
		player.removeMusica(playlist, numMusica );
		
	}
		 public static void listarMusicas(Scanner input, Player player){
			 System.out.println("Qual o numero da playlist que queres listar?");
			 int playlist=input.nextInt();
			 System.out.println(player.listaPlaylist(playlist));
		 }

		

		public static void printMenu(){
			 System.out.println("1 - Criar PlayList");
			 System.out.println("2- Adicionar Musica");
			 System.out.println("3 - Remover Musica");
			 System.out.println("4 - Listar Musicas (da PlayList)");
			 System.out.println("5- Tocar Musica");
			 System.out.println("0 - Sair");
		 }
		 
		 
}
