
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex7_Augusto_Castilho {
    public static void main (String [] args){
      Scanner s = new Scanner (System.in);
    double num1, num2;
        
        System.out.println("Informe o primeiro numero");
        num1 = s.nextDouble();
        System.out.println("Informe o segundo numero");
        num2 = s.nextDouble();
        
        System.out.println("O numero 1 é maior que o numero 2:  " + (num1>num2));
        System.out.println("o numero 2 é maior que o numero 1: " + (num1<num2));
        System.out.println("O numero 1 é igual o numero 2: " + (num1 == num2));
        System.out.println("O numero 1 é diferente do numero 2: " + (num1 != num2));
        
}}
