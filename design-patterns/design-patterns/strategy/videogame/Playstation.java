package strategy.videogame;

public class Playstation extends VideoGame{

	@Override
	public void jogar(String jogo) {
		System.out.println("\nExecutando o Playstation...");
		System.out.println("Inserido o cd " + jogo);
		System.out.println("Rodando em 32 bits...");
	}

}