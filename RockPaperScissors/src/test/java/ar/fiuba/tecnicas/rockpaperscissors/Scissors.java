package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {

	public Rock vs(Rock rock){
		return rock;
	}
	
	public Scissors vs(Paper paper){
		return this;
	}
	
	public Scissors vs(Scissors scissors){
		return this;
	}
}
