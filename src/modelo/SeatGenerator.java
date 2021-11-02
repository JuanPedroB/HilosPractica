package modelo;

public class SeatGenerator {

	private final int MAXCOLUMNS = 21;
	private final char MAXROWS = 'P';
	private Seat[][] seats;
	
	public SeatGenerator(){
		seats = new Seat[MAXROWS][MAXCOLUMNS];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = new Seat();
			}
		}
	}
	
	public Seat getSeat(Coordenada coord) {
		return seats[coord.getPosX()][coord.getPosY()];
		
	}

}
