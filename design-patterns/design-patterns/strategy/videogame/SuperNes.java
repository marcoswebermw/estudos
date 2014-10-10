package strategy.videogame;

public class SuperNes extends VideoGame{

	@Override
	public void jogar(String jogo) {
		System.out.println("\nExecutando o Super Nintendo...");
		System.out.println("Inserido o cartucho " + jogo);
		System.out.println("Rodando em 16 bits...");
	}
	

}
