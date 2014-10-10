package strategy;

import strategy.videogame.VideoGame;

public class Jogar {
	private VideoGame vg;
	
	public Jogar(VideoGame vg){
		this.vg = vg;
	}
	
	public void setVideoGame(VideoGame vg){
		this.vg = vg;
	}
	
	public void jogando(String jogo){
		vg.jogar(jogo); 
	}
}
