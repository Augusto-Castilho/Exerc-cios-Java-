
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex2_Augusto_Castilho {
   public static void main(String[] args){
        String nome, genero, cor, esporte;
        int idade;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        nome = s.next();
        System.out.println("Informe sua idade: ");
        idade = s.nextInt();
        System.out.println("Informe seu genero: ");
        genero = s.next();
        System.out.println("Informe sua cor favorita: ");
        cor = s.next();
        System.out.println("Você pratica algum esporte: ");
        esporte = s.next();
        
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, meu sexo é " + genero + ", minha cor favorita é " + cor + " e meu esporte favorito é " + esporte);
    }
   
       
       
}
