
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gus
 */
public class Exercicio6 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Digite 15 números");
        
        for (int i = 0; i < 15; i++) {

            while (true) {
                try {

                    numeros.add(Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Digite o " + (i + 1)
                                    + "° número")));
                    break;
                } catch (Exception e) {

                }
                JOptionPane.showMessageDialog(null, "Apenas números Por favor");
            }

        }
        
        for (int j = 0; j < 15; j++) {
            
            JOptionPane.showMessageDialog(null,(j + 1) + "° número digitado" 
                    +numeros.get(j) );
        }
           
            JOptionPane.showMessageDialog(null,"Numeros digitados\n "
                    + numeros.get(0) + "\n"
                    + numeros.get(1) + "\n"
                    + numeros.get(2) + "\n"
                    + numeros.get(3) + "\n"
                    + numeros.get(4) + "\n"
                    + numeros.get(5) + "\n"
                    + numeros.get(6) + "\n"
                    + numeros.get(7) + "\n"
                    + numeros.get(8) + "\n"
                    + numeros.get(9) + "\n"
                    + numeros.get(10) + "\n"
                    + numeros.get(11) + "\n"
                    + numeros.get(12) + "\n"
                    + numeros.get(13) + "\n"
                    + numeros.get(14)
            );
        

    }
}
