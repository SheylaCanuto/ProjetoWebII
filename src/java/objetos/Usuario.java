package objetos;


public class Usuario 
{
	private String nome;
	private String nickname;
	private String senha;
	private String email;
	
	
	public Usuario(String nome, String nickname, String senha, String email) 
	{
		setNome(nome);
		setEmail(email);
		setNickname(nickname);
		setSenha(senha);
	}
	
	public String getNome()
	{
		return nome;
	}
	
	private void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	private void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getSenha() 
	{
		return senha;
	}

	private void setSenha(String senha) 
	{
		this.senha = senha;
	}

	public String getEmail() 
	{
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}


}
