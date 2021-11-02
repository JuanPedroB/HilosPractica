package modelo;

public class Coordenada {

	private char posX;
	private int posY;

	public Coordenada(char posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public char getPosX() {
		return posX;
	}

	public void setPosX(char posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
