package objetos;

import java.util.ArrayList;

public class Album 
{
	private ArrayList<Musica> musicas;
	private String nomeArtista, nomeAlbum;
	private int faixas;
	
	public Album(String nome, String artista, String nomeArtistaAlbum) 
	{
		this.musicas = new ArrayList<>();
		this.setNomeArtista(artista);
		this.setNomeAlbum(nomeArtistaAlbum);
	}
	
	
	public boolean addMusica(Musica musica) 
	{
		if(this.musicas.contains(musica))
		{
			return false;
		} else
		{
			this.musicas.add(musica);
			setFaixas(this.faixas++);
		}
		return true;
	}

	public int getFaixas() 
	{
		return faixas;
	}

	public void setFaixas(int faixas) 
	{
		this.faixas = faixas;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}
	
	
}
