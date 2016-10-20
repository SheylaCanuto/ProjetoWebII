package sistema;

import java.util.ArrayList;

import objetos.Playlist;
import objetos.Usuario;

public class Conta 
{
	private Usuario usuario;
	private ArrayList<Playlist> playlists;
	private ArrayList<Conta> amigos;
	
	public Conta(Usuario usuario) 
	{
		setUsuario(usuario);
		setPlaylists(new ArrayList<Playlist>(20));
		setAmigos(new ArrayList<Conta>(100));
	}

	public Usuario getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario) 
	{
		this.usuario = usuario;
	}

	public ArrayList<Playlist> getPlaylists() 
	{
		return playlists;
	}

	public void setPlaylists(ArrayList<Playlist> playlists) 
	{
		this.playlists = playlists;
	}

	public ArrayList<Conta> getAmigos() 
	{
		return amigos;
	}

	public void setAmigos(ArrayList<Conta> amigos) 
	{
		this.amigos = amigos;
	}

}
