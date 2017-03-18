import java.io.IOException;

public class Player {
	private int numPlaylist;
	private Playlist[] listaPlaylist;
	private int capacidadePlaylist;
	
	
	
	
	public int getNumPlaylist() {
		return numPlaylist;
	}

	public Playlist[] getListaPlaylist() {
		return listaPlaylist;
	}


	public void setListaPlaylist(Playlist[] listaPlaylist) {
		this.listaPlaylist = listaPlaylist;
	}


	public int getCapacidadePlaylist() {
		return capacidadePlaylist;
	}


	public void setCapacidadePlaylist(int capacidadePlaylist) {
		this.capacidadePlaylist = capacidadePlaylist;
	}


	public void removeMusica(int numPlaylist,int posicaoDaMusicaPlaylist ){
		int numArray = numPlaylist-1 ;
		
		if(numArray>=0){
			listaPlaylist[numArray].removeMusica(posicaoDaMusicaPlaylist);
			
		}
		
	 }
		 
		 

	public void criaPlaylist(String nome, int capacidade){
		if (numPlaylist<capacidadePlaylist){
			listaPlaylist[numPlaylist] =new Playlist(nome, capacidade );
			numPlaylist++;
		}
		else 
			System.out.println("Nao ha espaco");
	}
		
	public void adicionaMusica(int numero, Musica musicaquequero){
		if(numero>=0 && numero <numPlaylist){
			
		listaPlaylist[numero].adicionaMusica(musicaquequero);
		}
		else 
			System.out.println("Numero invalido");
		
}
	public String listaPlaylist(int numero){

		return listaPlaylist[numero-1].listaMusicas();
	
}
	public void playMusica(int numPlaylist, int musica) throws IOException {
		int numero = numPlaylist - 1;
		if ((numero < 0) || (numero >= numPlaylist)) {
			throw new IllegalArgumentException("Playlist nao encontrada");
		} else {
			listaPlaylist[numero].playMusica(musica);
		}
	}
		
	public Player(int capacidadePlaylist) {
		this.numPlaylist = 0;
		this.listaPlaylist = new Playlist[capacidadePlaylist];
		this.capacidadePlaylist = capacidadePlaylist;
	}
	

}
