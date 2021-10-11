package ListadeLembretes;

import java.util.Scanner;

public class BlocoDeLembretes {
	private Lembrete[] lista = new Lembrete[10];
	Scanner entrada = new Scanner(System.in);
	String data, nome, descricao;
	public void incluirLembrete(Lembrete novo)
	{
		int i,indice = numeroDeLembretes();
		if(indice<this.lista.length)
		{
			for(i=0;i<this.lista.length;i++)
			{
				if(this.lista[i]==null)
				{
					break;
				}
			}
				System.out.println("Digite o nome do lembrete: ");					
				nome = entrada.next();
				System.out.println("Digite a descricao do lembrete: ");
				descricao = entrada.next();
				System.out.println("Formato de data: dd-mm-aa");
				System.out.println("Digite a data do lembrete: ");
				data =  entrada.next();
				this.lista[i] = new Lembrete(data,nome,descricao);
		}
		else
		{
			System.out.println("Número máximo atingido");
			System.out.println("Aumentando memória");
			Lembrete[] listaAux = new Lembrete[lista.length*2];
			for(i=0;i<lista.length;i++)
			{
				listaAux[i] = lista[i];
			}
			lista = listaAux;
		}
	}
	public int numeroDeLembretes()
	{
		int i,quantidade = 0;
		for(i=0;i<this.lista.length;i++)
		{
			if(this.lista[i]!=null)
			{
				quantidade += 1;
			}
		}
		return quantidade;
	}
	public void removerLembrete(int posicao)
	{
		System.out.println("Excluindo");
		this.lista[posicao] = null;
	}
	public void listarLembretes()
	{
		int i=0;
		System.out.println("Formato:");
		System.out.println("Item X: nome - descricao - data(dd-mm-aa)");
		for(i=0;i<this.lista.length;i++)
		{
			if(this.lista[i]!=null)
			{
				System.out.println("Item "+i+": "+this.lista[i].retornaNome()+"\t-\t"+this.lista[i].retornaDescricao()+"\t-\t"+this.lista[i].retornaData());
			}
		}
	}
	public void buscarLembretesPorData(String data)
	{
		int i=0;
		for(i=0;i<this.lista.length;i++)
		{
			if(this.lista[i]!=null)
			{
				if(this.lista[i].retornaData().equals(data))
				{
					System.out.println("Lembrete encontrado");
					System.out.println("Item "+i+": "+this.lista[i].retornaNome()+"\t-\t"+this.lista[i].retornaDescricao()+"\t-\t"+this.lista[i].retornaData());
				}
			}
		}
	}
	public void buscarLembretesPorNome(String nome)
	{
		int i=0;
		for(i=0;i<this.lista.length;i++)
		{
			if(this.lista[i]!=null)
			{
				if(this.lista[i].retornaNome().equals(nome))
				{
					System.out.println("Lembrete encontrado");
					System.out.println("Item "+i+": "+this.lista[i].retornaNome()+"\t-\t"+this.lista[i].retornaDescricao()+"\t-\t"+this.lista[i].retornaData());
				}
			}
		}
	}
}
