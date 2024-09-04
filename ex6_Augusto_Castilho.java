
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex6_Augusto_Castilho {
    public static void main (String [] args){
    
        Scanner s = new Scanner (System.in);
            double num1;
    
    System.out.println("Informe um numero:");
    num1 = s.nextDouble();
    
    System.out.println("Este número elevado a 2 é:" + Math.pow(num1,2 ));
    System.out.println("Estem número elevado a 4 é:" + Math.pow(num1, 4));
    System.out.println("Este número elevado a 6 é: " + Math.pow(num1, 6));
    System.out.println("Este número elevado a 8 é :" + Math.pow(num1, 8));
    System.out.println("Este número elevado a 10 é :" + Math.pow(num1 ,10));
    }
}
