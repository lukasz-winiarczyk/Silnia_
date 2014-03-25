package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;

/**
 * 
 * @author Marcin Grabowiecki
 * 
 *         proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 *         jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    
    private BigDecimal liczBigDec(int arg){
        if(arg<0){
            throw new ArithmeticException(
                    "Nie mozna obliczyc silni z liczby ujemnej");
        }
        if(arg>0){
            return BigDecimal.valueOf(arg).multiply(liczBigDec(arg-1));
        }else{
            return BigDecimal.valueOf(1);
        }
    }
    
    public String licz(int arg){
        return liczBigDec(arg).toString();
    }
}
