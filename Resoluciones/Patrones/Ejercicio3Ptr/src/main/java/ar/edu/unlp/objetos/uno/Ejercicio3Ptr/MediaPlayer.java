package ar.edu.unlp.objetos.uno.Ejercicio3Ptr;

import java.util.List;

public class MediaPlayer {
	private List<Media> media;
	
	
	public void play() {
		this.media.stream().forEach(m -> m.play());
	}
	

}
