package ordinateur;

public class OrdinateurApplication {

	public static void main(String[] args) {

		Ordinateur o = new Ordinateur("R of G", 25, new int[] { 100, 1000 });

		o.allumer();
		o.eteindre();

	}

}
