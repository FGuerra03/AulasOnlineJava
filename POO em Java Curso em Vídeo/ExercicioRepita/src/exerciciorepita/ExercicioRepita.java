/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Felipe Guerra
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int soma = 0;
        int contador = 0;
        int pares = 0;
        int impares = 0;
        int maior100 = 0;
        int media;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += numero;
            if (numero > 0){
                contador++;
            }
            if (numero % 2 != 0 && numero != 0){
                impares ++;
            } else if (numero != 0){
                pares++;
            }
            if (numero > 100){
                maior100++;
            }
            media = soma/contador;
        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr>" + 
                "<br>Total de Valores: " + contador +
                "<br>Total de Pares: " + pares +
                "<br>Total de Ímpares: " + impares +
                "<br>Acima de 100: " + maior100 +
                "<br>Média dos Valores: " + media+
                "<br>Somatório vale: " + soma +
                
                "</html>"
        );
    }
    
}
