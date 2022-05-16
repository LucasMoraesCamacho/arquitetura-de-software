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
public class Subtracao extends Valores{
      
      public Subtracao (double val1, double val2){
          super(val1,val2);
      }

      Subtracao(){
          
      }
    @Override
    public void Calcula() {
        setResult(getVal1() - getVal2());;
    }
    
    
}