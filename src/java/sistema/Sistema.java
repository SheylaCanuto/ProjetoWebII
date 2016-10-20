package sistema;

import java.util.ArrayList;

import objetos.Artista;
import objetos.Usuario;

public class Sistema 
{
	private ArrayList<Conta> contas;
	private ArrayList<Artista> artistas;
	
	public Sistema() 
	{
		setContas(new ArrayList<Conta>(200));
		setArtistas(new ArrayList<>());
	}
	
	public boolean criarConta(Usuario usuario) 
	{
		Conta conta = new Conta(usuario);
		
		if(getContas().contains(usuario))
		{
			return false;
		}
		
		getContas().add(conta);
		return true;
	}

	public boolean removerConta(Usuario usuario) 
	{
		if(getContas().remove(usuario) == true)
			return true;
		
		return false;
		
	}
	
	
	
	private ArrayList<Conta> getContas() 
	{
		return contas;
	}

	private void setContas(ArrayList<Conta> contas) 
	{
		this.contas = contas;
	}
	

	public ArrayList<Artista> getArtistas() 
	{
		return artistas;
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}
}
