
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex10_Augusto_Castilho {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double num1;
        
        System.out.println("Digite um numero inteiro:");
        num1 = s.nextInt();
        
        if (num1>10 && num1<100){
            
            System.out.println("Este numero elevado a 2 é" + Math.pow (num1,2) );
           
            
        } else{
           
            System.out.println("A raiz quadrada deste número é: %5.f" + Math.sqrt(num1));
           
            
  
        
        
        }
    }}