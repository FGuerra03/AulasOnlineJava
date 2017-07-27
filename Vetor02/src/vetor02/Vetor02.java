/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author Felipe Guerra
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int ano;
        System.out.print("Em que ano estamos ? ");
        ano = entrada.nextInt();
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            dias[1] = 29;
        } else {
            dias[1] = 28;
        }
        
        for(int i = 0; i < mes.length; i++){
            System.out.println("O mes de " + mes[i] + " tem " + dias[i] + " dias" );
        }
    }
    
}
