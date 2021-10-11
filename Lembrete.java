package ListadeLembretes;

public class Lembrete {
	private String data;
	private String nome;
	private String descricao;
	public Lembrete(String d, String n, String desc)
	{
		this.data = d;
		this.nome = n;
		this.descricao = desc;
	}
	public String retornaData()
	{
		return this.data;
	}
	public String retornaNome()
	{
		return this.nome;
	}
	public String retornaDescricao()
	{
		return this.descricao;
	}
}
