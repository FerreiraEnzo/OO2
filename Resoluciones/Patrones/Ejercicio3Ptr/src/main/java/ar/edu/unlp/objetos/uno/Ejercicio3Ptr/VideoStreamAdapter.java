package ar.edu.unlp.objetos.uno.Ejercicio3Ptr;

public class VideoStreamAdapter implements Media{
	private VideoStream adaptee;
	
	
	public VideoStreamAdapter(VideoStream videoStream) {
		this.adaptee = videoStream;
	}
	

	public void play() {
		this.adaptee.reproduce();
	}

}
