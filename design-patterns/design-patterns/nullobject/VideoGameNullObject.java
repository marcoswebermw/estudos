package nullobject;

import strategy.videogame.VideoGame;

public class VideoGameNullObject extends VideoGame{

	@Override
	public void jogar(String jogo) {
		System.out.println("\nImpossível jogar " + jogo + ".");
		System.out.println("Nenhum video game definido ainda.");
	}

}
