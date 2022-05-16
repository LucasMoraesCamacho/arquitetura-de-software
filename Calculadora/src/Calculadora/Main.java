package calculadora;
import java.security.InvalidParameterException;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Main {

      public void calculate( Calcula calcula){
          if(calcula == null){
              throw new InvalidParameterException("Erro");
          }
          
          calcula.Calcula();
       
    }
}