
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        
        int quantidade = 10;
        for (int i = 0; i < 10; i++) {
            numeros.add(quantidade++);
            System.out.println("Completos\n"
                    + numeros.get(i));

        }
        numeros.remove(3);

        for (int k = 0; k < 9; k++) {
            System.out.println("Sem a posição 3\n"
                    + numeros.get(k));
        }
        
        numeros.remove(4);
        for (int l = 0; l < 8; l++){
            System.out.println("\nNumeros com a a posição 3 e 4 removidas\n "
                    + numeros.get(l));
        }
        
    }

}
