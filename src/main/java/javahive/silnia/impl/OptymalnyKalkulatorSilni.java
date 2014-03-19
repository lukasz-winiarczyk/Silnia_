package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;




public class OptymalnyKalkulatorSilni implements KalkulatorSilni{
    
    private static final int MAKSYMALNY_ARGUMENT_DLA_LONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni kalkulatorSilni=null;
        if(podstawa<0){
        	throw new ArithmeticException("Nie mozna obliczyc silni z liczby ujemnej");
        }
        if(podstawa<=MAKSYMALNY_ARGUMENT_DLA_LONG){
        	kalkulatorSilni=new SzybkiKalkulatorSilni();
        }else{
        	kalkulatorSilni=new KalkulatorSilniBigDecimal();
        }
        return kalkulatorSilni.licz(podstawa);
    }
}
