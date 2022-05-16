/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Lucas
 */
public class Soma extends Valores {

    public Soma(double n1, double n2) {
        super(n1,n2);
    }

    Soma(){}
    @Override
    public void Calcula() {
       setResult(getVal1() + getVal2());    }
    
    
}