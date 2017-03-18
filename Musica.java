
public class Musica {
	private String titulo, autor, estilo;
	private double duracao;
	private String localizacao;
	
		public String getTitulo() {
			return titulo;
		}
		public void setLocalizacao(String localizacao){
			this.localizacao=localizacao;
		}
		public String autor() {
			return autor;
		}
		public String getEstilo() {
			return estilo;
		}
		public double getDuracao() {
			return duracao;
		}
		public String getLocalizacao(){
			return localizacao;
		}
		
		public Musica(String titulo,String autor,String estilo, double duracao, String localizacao) {
			this.titulo = titulo;
			this.autor = autor;
			this.estilo = estilo;
			this.duracao = duracao;
			this.localizacao = localizacao;
		}
		@Override
		public String toString() {
			return "Musica [titulo=" + titulo + ", autor=" + autor + ", estilo=" + estilo + ", duracao=" + duracao
					+ "]";
		}	
}
