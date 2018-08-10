
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Gus
 */
public class Exercicio8 {

    
    public static void main(String[] args) {
        
        
        ArrayList<Double> salario = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            salario.add(Double.parseDouble(JOptionPane.showInputDialog
               (null, "Digite o ", (i+1) + "º Salário ")));
        
        }
        
        String todosOsSalarios = "";
        for (int i = 0; i < salario.size(); i++) {
            todosOsSalarios += salario
        }
        
        double somatoria = 0;
        for (int i = 0; i < salario.size(); i++) {
            somatoria += salario.get(i);
        }
        
        double media = somatoria/salario.size();
        
        double somaPar = 0;
        double somaImpar = 0;
        int divisor = 0;
        for (int i = 0; i < salario.size(); i++) {
            if(i %2 == 0){
                somaPar += salario.get(i);
            }
            else{
                somaImpar += salario.get(i);
                divisor++;
            }
        }
        
         double mediaImpar = somaImpar/divisor; */
    }
    
}
