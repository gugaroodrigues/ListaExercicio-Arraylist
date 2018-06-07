
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 * @author Gustavo
 */
public class Exemplo05 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int quantidade = 0;
        for(int i = 0; i < 10; i++) {
            while (true) {
                try{
                    numeros.add(Integer.parseInt(JOptionPane
                .showInputDialog("Digite o " + (i + 1)
                + "° número")));
                    break;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,
                            "Filho deixa de ser zueiro");
                    
                }
                
            }
            
        }
         
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }

}
