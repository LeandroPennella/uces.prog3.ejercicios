package modelo;

import java.io.File;

public class Archivo extends Elemento {

	public Archivo(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	public long getSize(){return file.length();}

}
