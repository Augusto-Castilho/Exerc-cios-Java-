
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex4_Augusto_Castilho {
        public static void main(String [] args){
        int num1, num2;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = s.nextInt();
        
        if(num1 > num2){
            System.out.println("Número 1 é maior que número 2");
        } else if(num1 < num2){
            System.out.println("Número 2 é maior que número 1");
        } else {
            System.out.println("Os dois são iguais");
        }
        }
}
