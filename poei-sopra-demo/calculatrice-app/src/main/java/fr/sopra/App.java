package fr.sopra;

import fr.sopra.shared.math.MathUtils;

public class App 
{
    public static void main( String[] args )
    {
    	MathUtils mathUtils = new MathUtils();
    	
        System.out.println( "Factorielle de 7 : "+mathUtils.factorielle(7) );
    }
}
