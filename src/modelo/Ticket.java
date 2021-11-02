package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticket {
	
	private int maxUsers = 300;
	
	public void makeCinema() {
		
		Cinema cinema = Cinema.getCinema();
		ArrayList<User>users = new ArrayList<>();

			for (int i = 0; i < maxUsers; i++) {
				users.add(new User(cinema));
			}
			
			for (Iterator iterator = users.iterator(); iterator.hasNext();) {
				User user = (User) iterator.next();
				user.start();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
	}
	
}
