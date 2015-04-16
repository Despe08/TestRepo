
package Javaa;

public class Voiture extends Vehicule{
	boolean tatouageVitre = true;
	
	
	public Voiture() {
		super();
	}
	public Voiture(boolean tatouageVitre) {
		super();
		this.tatouageVitre = tatouageVitre;
	}
	public void tatouerVitre(){
		tatouageVitre = true;
	}
	public void detatouerVitre(){
		tatouageVitre = false;
	}
}
