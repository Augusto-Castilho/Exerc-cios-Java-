
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000772
 */
public class ex8_Augusto_Castilho {
    public static void main(String[] args) {
        double leitura_inicial,
                leitura_final,
                consumo,
                media_dia;
        int dias;
       String endereco, nome;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Leitura da Agua: ");
       System.out.print("Informe o Nome do responsavel: ");
       nome = s.nextLine();
       System.out.print("Endereço: ");
       endereco = s.nextLine();
       System.out.print("Leitura Inicial: ");
       leitura_inicial = s.nextDouble();
       System.out.print("Leitura Final: ");
       leitura_final = s.nextDouble();
       
       consumo = leitura_final - leitura_inicial;
       dias= 30;
       media_dia = consumo / dias;
       
       System.out.println("\n:.Relatorio de Consumo:");
       System.out.println("Cliente: " + nome + " - Endereco: " + endereco);
       System.out.printf(">Consumo: %.2f" + consumo);
       System.out.printf("\n>Dias: %d", dias);
       System.out.printf("\n>Media Diaria: %.2f" + media_dia);
       
    }
       
       
     
}
