
package exemploarraylist3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guss
 */
public class ExemploArrayList3 {

   
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5 ; i++){
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um numero")));
            }
        for (int i = 0; i < numeros.size(); i++){
            System.out.println("[" + i + "] => " + numeros.get(i));
        }
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++){
            soma += numeros.get(i);  
        
        }
        int menorNumero = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
        
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) > maiorNumero){
                maiorNumero = numeros.get(i);
                
            }
        }
                
                
                
        double media = soma / numeros.size();
        JOptionPane.showMessageDialog(null, 
                "A soma é: " + soma + "\nMédia: "
                        + media);
    }
    
}
