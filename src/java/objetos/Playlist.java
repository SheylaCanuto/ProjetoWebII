package objetos;

import java.util.ArrayList;

public class Playlist 
{
	
	private String nome;

	public Playlist(String nome, Musica musica) 
	{
		setNome(nome);
		addMusica(musica);
	}

	private void addMusica(Musica musica) 
	{
		ArrayList<Musica> listaMusicas = new ArrayList<>(20);
		
			if(listaMusicas.isEmpty() && listaMusicas.size()<= 20)
			{
				listaMusicas.add(musica);
			}
		
	}

	private void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
}
