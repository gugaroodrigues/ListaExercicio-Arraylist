
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gus
 */
public class Exercicio9 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    numeros.add(Integer.parseInt(JOptionPane.showInputDialog(
                            null, "Digite o " + (i + 1) + "° numero")));
                    break;
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null,
                            "Somente numeros por favor");
                }

            }
            }
        for (int i = 0; i < 10; i++) {
            
        }
        if (numeros.get(numeros.size()-1) >= 9001){
            JOptionPane.showMessageDialog(
             null , new  ImageIcon (
                Exercicio9.class.getResource ( " /imagens/giphy.gif " )));

        
            
        }
        
            if(numeros.get(0) == numeros.get(numeros.size()-1)){
                JOptionPane.showMessageDialog(null,"Numeros digitados\n"
                + numeros.get(0) +"\n" + numeros.get(numeros.size()-1) + "\nOs numeros armazenados na primeira \n"
                        + "e na ultima posição são iguais");
            }
            else{
                JOptionPane.showMessageDialog(null,"Numeros digitados\n"
                + numeros.get(0) +"\n" + numeros.get(numeros.size()-1) + "\nOs numeros armazenados na primeira\n"
                        + "e na ultima posição não são iguais\n"  );
            }
    }

}
