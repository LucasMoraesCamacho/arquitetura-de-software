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
public class Valores implements Calcula {
    
    @Getter @Setter public double val1;
    @Getter @Setter public double val2;
    @Getter @Setter public double result;
    
    Valores(){}

    public Valores(double n1, double n2){
        this.val1 = n1;
        this.val2 = n2;
    }
    
    @Override
    public void Calcula() {
    }
    
}