package fr.sopra.shared.math;

public class MathUtils {

	public int factorielle(int n){
		if(n<=1)
			return 1;
		return factorielle(n-1)*n;
	}
}
