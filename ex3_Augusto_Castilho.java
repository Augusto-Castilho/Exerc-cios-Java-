
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex3_Augusto_Castilho {
        public static void main(String args[]){
        double num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe num1: ");
        num1 = s.nextInt();
        System.out.println("Infomre num2: ");
        num2 = s.nextInt();
        
        System.out.println("Exemplo adição");
        System.out.println("Adição: " + (num1 + num2));
        
        System.out.println("Exemplo divisão");
        System.out.println("Divisão: " + (num1 / num2));
        
        System.out.println("Exemplo multiplicação");
        System.out.println("Multiplicação: " + (num1 * num2));
        
        System.out.println("Exemplo subtração");
        System.out.println("Subtração: " + (num1 - num2));
    }
    
}
