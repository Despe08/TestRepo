package Javaa;

public class Vehicule {
	int prix = 200;
	String nom = "";
	
	Option option1 = new Option(100, "test");
	Option option2 = new Option();

	public int CalculerprIX(){
		return prix + option1.prix+ option2.prix;

}

public Vehicule() {
	super();
}
}
