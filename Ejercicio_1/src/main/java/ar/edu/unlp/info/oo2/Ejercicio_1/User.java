package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.ArrayList;


public class User {
	ArrayList <Tweet> tws;
	String screenName;
	
	public User(String screenName) {
		this.tws = new ArrayList<Tweet>();
		this.screenName = screenName;
	}
	
	public void publicTweet(String txt) {
		Tweet tw = new Tweet(txt);
		this.tws.add(tw);
	}
	
	public void publicReTweet(String txt, Tweet tweet) {
		if (txt.length() < 280){
			Tweet tw = new Tweet(txt, tweet);
			this.tws.add(tw);
		}else {
			System.out.println("El tweet tiene mas de 280 caracteres");
		}
	}
	
	public void deleteTweets() {
		this.tws = null;
	}
	
	public ArrayList<Tweet> getTws(){
		return this.tws;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
	
}
