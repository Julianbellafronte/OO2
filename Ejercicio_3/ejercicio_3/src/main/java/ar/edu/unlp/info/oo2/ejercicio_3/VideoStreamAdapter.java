package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoStreamAdapter extends Media {

	VideoStream vs;
	
	public VideoStreamAdapter() {
		vs = new VideoStream();
	}
	
	public String play() {
		return vs.reproduce();
	}
	
}
