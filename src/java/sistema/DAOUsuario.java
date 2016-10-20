package sistema;

import objetos.Usuario;

public class DAOUsuario
{
	public DAOUsuario() 
	{
		
	}
	
	public boolean verificar(Usuario usuario) 
	{
		if(verificaNome(usuario.getNome()) == true)
		{
			if(verificaNick(usuario.getNickname()) == true)
			{
				if(verificaEmail(usuario.getEmail()) == true)
				{
					if(verificaSenha(usuario.getSenha()) == true)
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean verificaSenha(String senha)
	{
		if(senha.contains(" "))
		{
			return false;
		}
		return true;
	}

	private boolean verificaEmail(String email) 
	{
		if(email.contains("@") && email.indexOf("@") != 0)
		{
			if(email.contains(".com") || email.contains(".com.br"))
			{
				return true;
			}
		}
			
		return false;
	}

	private boolean verificaNick(String nickname) 
	{
		if(nickname.contains(" "))
		{
			return false;
		}
		return true;
	}

	private boolean verificaNome(String nome) 
	{
		int i = 0;
		int j = 0;
		
		while(i < nome.length())
		{
			while(j <= 9)
			{
				if(nome.charAt(i) == j)
				{
					break;
				}
				j++;
			}
			
			if(j <= 9)
			{
				break;
			}
			return false;
		}
		return true;
	}

	
}
