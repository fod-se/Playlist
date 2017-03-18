import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Playlist {
	private int capacidade, numMusicas;
	private Musica[] listaMusicas;
	private String nomePlaylist;
	
		public String getNomePlaylist(){
			return nomePlaylist;
		}
		public void setNomePlaylist(String nomePlaylist){
			this.nomePlaylist = nomePlaylist;
		}
		
		public void adicionaMusica(Musica musica ){
			if (numMusicas<capacidade){
				listaMusicas[numMusicas] = musica;
				numMusicas++;
			}
		}
		
		public void removeMusica(int numeroDaMusica){
			if((numeroDaMusica >=0) && (numeroDaMusica < numMusicas)){
				listaMusicas[numeroDaMusica] = listaMusicas[numMusicas - 1] ;
				listaMusicas[numMusicas - 1] = null;
				numMusicas--;
			}
			else{
				System.out.println("Nao existem musicas");
			}
		}
		
		public String listaMusicas(){
			String lista ="";
			for (int i=0; i<numMusicas; i++ )/*i é o meu contador*/{
				lista = lista + i + listaMusicas[i] + "\n";
			}
			return lista;
		}
		public void playMusica(int numeroDaMusica) throws IOException{
		 int musica = numeroDaMusica -1;
		 if ((musica < 0) || (musica >= numMusicas)) {
			 System.out.println(musica);
				throw new IllegalArgumentException("Musica indisponivel");
			} 
		 else {
				String som = listaMusicas[musica].getLocalizacao();
				Desktop.getDesktop().open(new File(som));
			}
		}
		 

		
	public Playlist(String nome, int capacidade){
		this.nomePlaylist = nome;
		this.capacidade = capacidade;
		this.numMusicas=0;
		this.listaMusicas = new Musica[capacidade];
		
	}
	

}
