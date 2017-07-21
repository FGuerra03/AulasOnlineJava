/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Felipe Guerra
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner notas = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = notas.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = notas.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println("Sua média foi " + media);
        if (media >= 9){
            System.out.println("Parabéns");
        }
    }
}
