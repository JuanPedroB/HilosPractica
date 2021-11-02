package modelo;

public class User extends Thread{
	private Cinema cinema;
	private int id;
	private static int order = 0;

	public User(Cinema cinema) {
		super();
		this.cinema = cinema;
		this.id = order++;
	}
	
	public void run() {
		super.run();
		boolean isTaken;
		Coordenada coordenada;
		
		do {
			coordenada = new Coordenada(row(), column());
			isTaken = cinema.AssignSeat(coordenada);
		} while (!isTaken);
		present(coordenada, isTaken);
	}
	
	public void present(Coordenada coordenada, boolean isTaken) {
		System.out.println("El user "+id+" tiene el asiento: "+coordenada.getPosX()+":"+coordenada.getPosY()+" - "+isTaken);
	}
	
	public char row() {
		return this.cinema.getRow();
	}
	
	public int column() {
		return this.cinema.getColumn();
	}
	
}
