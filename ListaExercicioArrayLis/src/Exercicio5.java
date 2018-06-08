
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class Exercicio5 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Digite 4 nomes");

        for (int i = 0; i < 4; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) 
                    + "° nome:"));
            
        }
        
        for (int j = 0; j <nomes.size(); j++){
        }
            JOptionPane.showMessageDialog(null, nomes);
    }

}
