package POO;

public class ClasseProduto {
	private String nomeJogo;
	private double preco;
	private String categoriaJogo;
	private int classificacaoEtaria;
	private String formadePagamento;
	
	public ClasseProduto(String nomeJogo, double preco, String categoriaJogo, int classificacaoEtaria,
			String formadePagamento) {
		super();
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.categoriaJogo = categoriaJogo;
		this.classificacaoEtaria = classificacaoEtaria;
		this.formadePagamento = formadePagamento;
	}
	
	public String getNomeJogo() {
		return nomeJogo;
	}
	
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCategoriaJogo() {
		return categoriaJogo;
	}
	
	public void setCategoriaJogo(String categoriaJogo) {
		this.categoriaJogo = categoriaJogo;
	}
	
	public int getClassificacaoEtaria() {
		return classificacaoEtaria;
	}
	
	public void setClassificacaoEtaria(int classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}
	
	public String getFormadePagamento() {
		return formadePagamento;
	}
	
	public void setFormadePagamento(String formadePagamento) {
		this.formadePagamento = formadePagamento;
	}

	public void visualizar() {
		System.out.println("Nome do jogo: "+nomeJogo);
		System.out.println("Preço: R$ "+preco);
		System.out.println("Categoria: "+categoriaJogo);
		System.out.println("Faixa etária: "+classificacaoEtaria+" anos");
		System.out.println("Forma de pagamento: "+formadePagamento);
	
	}
		
}