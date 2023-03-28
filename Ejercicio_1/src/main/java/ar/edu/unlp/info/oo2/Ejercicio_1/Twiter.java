package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.ArrayList;

public class Twiter {

	ArrayList<User> users;

	public Twiter() {
		users = new ArrayList<User>();
	}
	
	public Boolean checkScreenName(String screenName) {
		for(User u: users) {
			if(u.getScreenName() == screenName ) {
				return false;
			}
		}
		return true;
	}
	
	public void addUser(String screenName) {
		if(this.checkScreenName(screenName) == true) {
			User u = new User(screenName);
			users.add(u);
		}
	}
	
	
	
	
	
}
