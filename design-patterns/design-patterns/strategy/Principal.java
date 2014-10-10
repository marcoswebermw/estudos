package strategy;

import strategy.videogame.Nintendo64;
import strategy.videogame.Playstation;
import strategy.videogame.SuperNes;
import strategy.videogame.VideoGame;

public class Principal {

	// O algoritmo é trocado em tempo de execução de acordo
	// com a necessidade sem uso de condicionais. Um problema 
	// é a grande quantidade de classes criadas, tornando 
	// trabalhoso o gerenciamento delas.
	public static void main(String[] args) {
		VideoGame v = new SuperNes();
		String jogo = "Super Mario World";
		
		Jogar j = new Jogar(v);
		j.jogando(jogo);
		
		v = new Nintendo64();
		jogo = "Mario 64";
		j.setVideoGame(v);
		j.jogando(jogo);
		
		v = new Playstation();
		jogo = "Tomb Raider";
		j.setVideoGame(v);
		j.jogando(jogo);
	}

}
