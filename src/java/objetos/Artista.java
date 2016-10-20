package objetos;

import java.util.ArrayList;

public class Artista 
{
	private String nome;
	private ArrayList<Album> albuns;
	
	
	public Artista(String nome) 
	{
		setNome(nome);
		setAlbuns(new ArrayList<Album>());
	}
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public ArrayList<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(ArrayList<Album> albuns) {
		this.albuns = albuns;
	}

	
	
	
}
