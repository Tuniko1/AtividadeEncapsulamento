package modules;

public class Produto {
	public String descricao;
	private int qtd;
	private double preco; 
	private int valorTotal;

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String Desc) {
		this.descricao = Desc;

	}
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int quantidade) {
		this.qtd = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
		
	}
	
	
	public int getvalorTotal() {
		return valorTotal;
	}
	public void setvalorTotal(int total) {
		this.valorTotal = total;
		
	}
}
