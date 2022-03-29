/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
import java.io.*;
import java.util.Scanner;
        
        
public class Calculadora {
    
    public static void main(String[] args){
        
        float N1, N2;
        Scanner ReadN = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        N1 = ReadN.nextFloat();
        System.out.println("Informe o segundo número: ");
        N2 = ReadN.nextFloat();
        
        Operacoes calc = new Operacoes();
        
        System.out.println("A Soma deu: " + calc.SumN(N1, N2));
        System.out.println("A Subtrção deu: " + calc.SubN(N1, N2));
        System.out.println("A Multiplicação deu: " + calc.MulN(N1, N2));
        if (N2 != 0){
            System.out.println("A Divisão deu: " + calc.DivN(N1, N2));
        }
        else
            System.out.println("Não é possível divisão por zero!!");
        
        
    }
    
}
