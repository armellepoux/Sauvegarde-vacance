package bibliotheque;

public class DisqueExisteDejaException extends Exception{
	public DisqueExisteDejaException(Disque disqueEnErreur) {
		super("Existe déjà ("+disqueEnErreur.getCodeBarre()+")");
	}
}
