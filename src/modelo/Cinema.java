package modelo;

import java.util.Random;

public class Cinema{
	
	private Pit pit;
	private static Cinema cinema = new Cinema();
		
	public Cinema() {
		this.pit = new Pit();
	}
	
	public synchronized boolean AssignSeat(Coordenada coordenada) {
			Seat seat = pit.getSeat(coordenada);
			if (seat.isTaken()) {
				return false;
			}
			seat.setTaken(true);
			return true;
	}

	public char getRow() {
		char row = (char) (new Random().nextInt(15)+'A');
		return row;
	}	
	
	public int getColumn() {
		int column = new Random().nextInt(20) + 1;
		return column;
	}
	
	public static Cinema getCinema() {
		return cinema;
	}
	
}
