
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex5_Augusto_Castilho {
       public static void main(String args []){
        int numero;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numero = s.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número é par");
    }   else
            System.out.println("O número é ímpar");
                    
       
    }

}
