package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Tweet {

	String txt;
	Tweet reTw;
	
	public Tweet(String txt) {
		this.txt = txt;
	}
	
	public Tweet(String txt, Tweet reTw) {
		this.txt = txt;
		this.reTw = reTw;
	}
	
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public Tweet getReTw() {
		return reTw;
	}
	public void setReTw(Tweet reTw) {
		this.reTw = reTw;
	}
	
	
}
