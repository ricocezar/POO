package POO;

public class testaGame {

	public static void main(String[] args) {
		ClasseProduto jogo1 = new ClasseProduto("FIFA 2023",399,"esporte",10,"pix");
		ClasseProduto jogo2 = new ClasseProduto("GTA",198,"ação-aventura",16,"boleto");
		
		jogo1.visualizar();
		jogo2.visualizar();
	}

}
