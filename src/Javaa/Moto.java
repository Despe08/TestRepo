package Javaa;

public class Moto extends Vehicule{
	boolean antivol = true;

	public Moto() {
		super();
	}

	public Moto(boolean antivol) {
		super();
		this.antivol = antivol;
	}
	public void setAntivol(){
		antivol = true;
	}
	public void removeAntivol(){
		antivol = false;
	}
	public boolean hasAntivol(){
		return antivol;
	}

}
