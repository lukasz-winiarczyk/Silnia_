package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;
import com.google.common.math.LongMath;
import com.google.common.math.BigIntegerMath;


/**
 *
 * @author Lukasz Winiarczyk
 */
public class KalkulatorSilniGuava implements KalkulatorSilni{
	
	private static final int MAKSYMALNY_ARGUMENT_DLA_LONG=12;
	
    public String licz(int arg) {
    	if(arg>MAKSYMALNY_ARGUMENT_DLA_LONG){
    		return BigIntegerMath.factorial(arg).toString();
    	}
    	return ""+LongMath.factorial(arg);
    }
}
