package modelo;

import java.io.File;

public abstract class Elemento {

	protected File file;
	
	public Elemento (File file){this.file=file;}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public abstract long getSize();
}
